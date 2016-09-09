<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no"/>
	<title>首页</title>
	<link rel="stylesheet" href="css/common.css">
	<link rel="stylesheet" href="css/responsive.css">
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery-ui.min.js"></script>
	<script type="text/javascript" src="js/unslider.min.js"></script>
</head>
<body>

<div class="full">
	<div class="container">
		<div class="nav-top"><a href="">登录</a><a href="">手机版</a><a href="">关于网上营业厅</a></div>
		<div class="top">
			<a class="logo" href=""><img src="images/logo.png" alt=""></a>
			<ul class="nav">
				<li><a class="on" href="">首页</a></li>
				<li><a href="">资费信息</a></li>
				<li><a href="">新闻资讯</a></li>
				<li><a href="">服务与支持</a></li>
				<li><a href="">投诉建议</a></li>
			</ul>
			<div class="search">
				<input type="text">
				<button>搜索</button>
			</div>
		</div>
	</div>
</div>
<!-- 轮播海报-->
<script>
  $(function(){
    var slidey = $('.carousel').unslider({
        speed: 800,			   
        delay: 3000,			
        //complete: function() {}, 
        //keys: true,			 
        dots: true,		//程序自动添加OL标签  
        //fluid: false
    });
    data = slidey.data('unslider'); 
    //data.move(2, function() {}); 
    $('.slidey-arrow').click(function() {
          var fn = this.className.split(' ')[1];
          data[fn]();
    });
  });
</script>
<div class="carousel full">
	<ul>
		<li><a href="#"><img src="images/banner01.jpg"></a></li>
		<li><a href="#"><img src="images/banner02.jpg"></a></li>
		<li><a href="#"><img src="images/banner03.jpg"></a></li>
		<li><a href="#"><img src="images/banner04.jpg"></a></li>
	</ul>
	<a href="javascript:void(0);" class="slidey-arrow prev"></a>
	<a href="javascript:void(0);" class="slidey-arrow next"></a>
</div>

<div class="container">
	<!-- 特色服务 -->
	<div class="service">
		<h2>特色服务</h2>
		<ul class="clear">
			<li><a class="serv_1" href=""><span>费用查询</span><i></i></a></li>
			<li><a class="serv_2" href=""><span>充值缴费</span><i></i></a></li>
			<li><a class="serv_3" href=""><span>业务办理</span><i></i></a></li>
			<li><a class="serv_4" href=""><span>故障申告</span><i></i></a></li>
			<li><a class="serv_5" href=""><span>我的服务</span><i></i></a></li>
			<li><a class="serv_6" href=""><span>用户中心</span><i></i></a></li>
		</ul>
	</div>
	<div class="info">
		<h2>资讯新闻<a href="">更多>></a></h2>
		<ul>
			<li><a href="">航天二院：打造ICT服务前沿品牌...</a></li>
			<li><a href="">航天二院：打造ICT服务前沿品牌...</a></li>
			<li><a href="">航天二院：打造ICT服务前沿品牌打造ICT服务前沿品牌...</a></li>
		</ul>
		<h2>业务使用指南<a href="">更多>></a></h2>
		<ul>
			<li><a href="">航天二院：打造ICT服务前沿品牌...</a></li>
			<li><a href="">航天二院：打造ICT服务前沿品牌...</a></li>
			<li><a href="">航天二院：打造ICT服务前沿品牌...</a></li>
			<li><a href="">航天二院：打造ICT服务前沿品牌...</a></li>
			<li><a href="">航天二院：打造ICT服务前沿品牌...</a></li>
		</ul>
	</div>
</div>

<!-- footer -->
<div class="full">
	<div class="container footer">
		<p><a href="">法律声明</a><span>|</span><a href="">网站地图</a></p>
		<p>掌上营业厅：www.etcom.cn 客户服务电话：手机营业厅下载</p>
		<p>北京航天情报与信息研究所 版权所有 Copyright © 2010-2025 </p>
	</div>
</div>
</body>
</html>