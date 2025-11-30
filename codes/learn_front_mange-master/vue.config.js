module.exports = {
	transpileDependencies: true,
	publicPath:'/',
	outputDir: 'dist', // 输出文件目录：在npm run build时，生成文件的目录名称
  	assetsDir: 'assets', // 放置生成的静态资源 (js、css、img、fonts) 的 (相对于 outputDir 的) 目录
	devServer: {
		host: '127.0.0.1',
		port: 3000, // 端口
		open: true,
		client: {
			overlay: false,
		},
		proxy: {
			'/api': {  //这个无中生有的api表示浏览器在请求资源（图片、文件、接口）时检测到请求路径中有api就要将请求的前半部分替换成target配的地址，披着123.123的壳子去请求456.456的资源
				target: 'http://127.0.0.1:8080/',
				changeOrigin: true,
				pathRewrite: {
					'^/api': ''
				}
			}
		},
	},

	/* 修改html标题 */
	chainWebpack: config => {
		config.plugin('html')
			.tap(args => {
				args[0].title = "ZJ";
				return args;
			})
	},
}
