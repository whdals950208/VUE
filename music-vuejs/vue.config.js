module.exports = {
    outputDir : "../music-spring/src/main/resources/static",
    devServer: {
        proxy: {
            'api' : {
                target : 'http://localhost:9000',
                ws : true,
                changeOrigin : true,
            }
        }
    }
}