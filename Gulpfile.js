var gulp = require('gulp');
var sass = require('gulp-sass');
var postcss = require('gulp-postcss');
var autoprefixer = require('autoprefixer');
var sourcemaps = require('gulp-sourcemaps');
var concat = require('gulp-concat');
var nano = require('gulp-cssnano');

/* local vars */
var sources = ['./src/main/java/ui/client/sass/camber.scss'];
//var sources = ['./src/main/java/camber/client/**/*.scss', './src/main/java/camber/client/**/*.css'];
var autoprefixVersions = 'last 2 versions';
var outputLocation = 'src/main/java/ui/public/css/';
var outputFile = 'clickhandler-web.min.css';


/* For Dev (with source maps) */

gulp.task('default', ['scss', 'watch']);

gulp.task('watch', function () {
    gulp.watch(sources, ['scss']);
});

gulp.task('scss', function () {
    gulp.src(sources)
        .pipe(sourcemaps.init())
        .pipe(sass().on('error', sass.logError))
        .pipe(postcss([ autoprefixer({ browsers: [autoprefixVersions] }) ]))
        .pipe(concat(outputFile))
        .pipe(nano({"zindex": false, "reduceIdents": false}))
        .pipe(sourcemaps.write("./../"))
        .pipe(gulp.dest(outputLocation));
});






