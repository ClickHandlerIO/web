var webpack = require('webpack');
var path = require('path');
var buildPath = path.resolve(__dirname, 'build');
var OUTPUT_FILE_NAME = "webpack-output.js";

var config = {
    entry: [path.join(__dirname, '/app.js')],

    resolve: {
        extensions: ["", ".js", ".jsx"] // When require, do not have to add these extensions to file's name
    },

    devtool: 'inline-source-map',

    output: {
        path: buildPath,
        filename: OUTPUT_FILE_NAME
    },

    plugins: [
        new webpack.optimize.DedupePlugin(),
        new webpack.optimize.UglifyJsPlugin({
            compress: {
                warnings: false // suppresses warnings, usually from module minification
            }
        }),
        new webpack.DefinePlugin({
            'process.env':{
                'NODE_ENV': JSON.stringify('production')
            }
        })
    ]
};

module.exports = config;
