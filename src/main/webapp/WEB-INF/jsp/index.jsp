<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/13
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>杭州千峰学生项目集合</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/default.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/styles.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/index.css" />
    <!--[if IE]>
    <script src="http://libs.useso.com/js/html5shiv/3.7/html5shiv.min.js"></script>
    <![endif]-->

    <script src="${pageContext.request.contextPath}/static/js/jquery-1.11.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/unslider.min.js"></script>
    <link rel="stylesheet" href="css/index.css" />
</head>
<body>

<nav id="navbar">
    <div id="container-fluid">
        <div id="navbar-header">
            <a id="navbar-brand" href="#">
                <img style="width: 100px; height: 25px;" alt="千锋教育" src="${pageContext.request.contextPath}/static/img/logo.png">
            </a>
        </div>
        <ul id="navbar-right">
            <li>
                <a href="java_shipin.html">Java随堂视频教程</a>
            </li>
        </ul>
        <div class="clean"></div>
    </div>

</nav>

<!--轮播图-->
<div class="banner" id="b04">
    <ul>
        <li><img src="${pageContext.request.contextPath}/static/img/lunbo/01.jpg" alt="" width="100%" height="480"></li>
        <li><img src="${pageContext.request.contextPath}/static/img/lunbo/02.jpg" alt="" width="100%" height="480"></li>
        <li><img src="${pageContext.request.contextPath}/static/img/lunbo/03.jpg" alt="" width="100%" height="480"></li>
        <li><img src="${pageContext.request.contextPath}/static/img/lunbo/04.jpg" alt="" width="100%" height="480"></li>
        <li><img src="${pageContext.request.contextPath}/static/img/lunbo/05.jpg" alt="" width="100%" height="480"></li>
    </ul>
    <a href="javascript:void(0);" class="unslider-arrow04 prev"><img class="arrow" id="al" src="${pageContext.request.contextPath}/static/img/lunbo/arrowl.png"
                                                                     alt="prev" width="20" height="35"></a>
    <a href="javascript:void(0);" class="unslider-arrow04 next"><img class="arrow" id="ar" src="${pageContext.request.contextPath}/static/img/lunbo/arrowr.png"
                                                                     alt="next" width="20" height="37"></a>
</div>

<ol class="container breadcrumb">
    <li>
        <a href="index.html">杭州千峰</a>
    </li>
    <span style="color: gray;">
				/
			</span>
    <li>
        <a href="javascript:void(0)">Java项目列表</a>
    </li>
</ol>

<!--info-->
<div class="panel panel-default">
    <div class="container">
        <div class="panel-body">
            <p>杭州千峰Java教学项目特点：</p>
            <p>
                一、不会只是一个DEMO：实战项目作为教学案例，让你在学会知识点的同时，更多的了解和掌握为什么要这么做。现在市面上很多项目其实都只是一个简单的Demo。并不能跟实际的商用项目相比较。项目中基本都是增删改查的重复低级劳动。</p>
            <p>
                二、不会只是单表操作：我们更重视学生的业务逻辑学习。没有业务逻辑的项目等于一具没有灵魂的尸体。但是，市面上的很多项目因为缺少完整的业务逻辑，导致永远是单表操作。或者项目中看似表很多，但是其实只是单表操作的集合。</p>
            <p>三、不会只是单体架构：分布式集群将全班级所有同学的电脑联合起来，搭建分布式服务集群。并且配合相应的压力测试让项目更加稳定。</p>
        </div>
    </div>
</div>
<!--一阶段-->
<div class="panel panel-default">
    <div class="container">
        <div class="panel-heading">
            <h3 class="panel-title">一阶段项目</h3>
        </div>
        <div class="panel-body">
            <article class="htmleaf-container">
                <div class="wall">
                    <a class="article" href="#">
                        <img src="${pageContext.request.contextPath}/static/img/1.jpg"/>
                        <h2>易购</h2>
                        <p style="text-align: left">Cursus cursus proin auctor in in ac, nunc, tortor</p>
                        <button type="button" class="view">查看演示</button>
                    </a>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/2.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/3.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/4.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/5.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/6.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>

                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/7.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/8.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                </div>
            </article>
        </div>
    </div>
</div>

<div class="panel panel-default">
    <div class="container">
        <div class="panel-heading">
            <h3 class="panel-title">二阶段项目</h3>
        </div>
        <div class="panel-body">
            <article class="htmleaf-container">
                <div class="wall">
                    <a class="article" href="#">
                        <img src="${pageContext.request.contextPath}/static/img/1.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </a>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/2.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/3.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/4.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/5.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/8.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/9.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/10.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                </div>
            </article>
        </div>
    </div>
</div>

<div class="panel panel-default">
    <div class="container">
        <div class="panel-heading">
            <h3 class="panel-title">三阶段项目</h3>
        </div>
        <div class="panel-body">
            <article class="htmleaf-container">
                <div class="wall">
                    <a class="article" href="#">
                        <img src="${pageContext.request.contextPath}/static/img/1.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </a>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/2.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/3.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/4.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/5.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/8.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/9.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/10.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                </div>
            </article>
        </div>
    </div>
</div>

<div class="panel panel-default">
    <div class="container">
        <div class="panel-heading">
            <h3 class="panel-title">四阶段项目</h3>
        </div>
        <div class="panel-body">
            <article class="htmleaf-container">
                <div class="wall">
                    <a class="article" href="#">
                        <img src="${pageContext.request.contextPath}/static/img/1.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </a>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/2.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/3.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/4.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/5.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/8.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/9.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/10.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                </div>
            </article>
        </div>
    </div>
</div>

<div class="panel panel-default">
    <div class="container">
        <div class="panel-heading">
            <h3 class="panel-title">学生自选项目</h3>
        </div>
        <div class="panel-body">
            <article class="htmleaf-container">
                <div class="wall">
                    <a class="article" href="#">
                        <img src="${pageContext.request.contextPath}/static/img/1.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </a>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/2.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/3.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/4.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/5.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/8.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/9.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                    <div class="article">
                        <img src="${pageContext.request.contextPath}/static/img/10.jpg"/>
                        <h2>Cursus cursus proin auctor in in ac, nunc, tortor</h2>
                    </div>
                </div>
            </article>
        </div>
    </div>
</div>
<script src="http://libs.useso.com/js/jquery/2.1.1/jquery.min.js" type="text/javascript"></script>
<script>
    window.jQuery || document.write('<script src="${pageContext.request.contextPath}/static/js/jquery-2.1.1.min.js"><\/script>')
</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jaliswall.js"></script>
<script type="text/javascript">
    //瀑布流
    $(function () {
        $('.wall').jaliswall({
            item: '.article'
        });
    });

    //			轮播图
    $(document).ready(function (e) {

        var unslider04 = $('#b04').unslider({

                dots: true

            }),

            data04 = unslider04.data('unslider');

        $('.unslider-arrow04').click(function () {

            var fn = this.className.split(' ')[1];

            data04[fn]();

        });

    });
</script>
</body>
</html>
