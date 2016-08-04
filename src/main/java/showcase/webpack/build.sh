#!/usr/bin/env bash

# Config
FILE_NAME=webpack-output
OUTPUT_DIR=../resources
MAP_DIR=../public

echo "*** Starting Webpack Build ***";
OUTPUT=${OUTPUT_DIR}/${FILE_NAME}
MAP_OUTPUT=${MAP_DIR}/${FILE_NAME}

# remove files
rm -f ${OUTPUT}.js;
rm -f ${OUTPUT}-prod.js;

# run webpack
echo "*** Building DEV ***";
webpack --config webpack.config.js --progress
echo "*** Building PROD ***";
webpack --config webpack-prod.config.js --progress

# copy files
echo "Copying Output...";
mkdir -p ${OUTPUT_DIR}
mkdir -p ${MAP_DIR}
cp build/${FILE_NAME}.js ${OUTPUT}.js;
cp build/${FILE_NAME}-prod.js ${OUTPUT}-prod.js;

# cleanup
rm -rf build;

echo "*** Webpack Build Complete ***";