Weather (Android app)
===============

A beautiful weather app: DynamicBackground (clear, rainy, foggy, etc), AqiView, DailyForecastView, HourlyForecastView and more.

一款精致的天气APP，动态天气背景(10*2种天气效果，每种区分白天和夜间)、一周天气曲线图、24H曲线图、空气质量/风速/日出日落图等。

Screenshot
-----

![Weather](https://raw.github.com/Mixiaoxiao/Weather/master/Screenshot1.jpg)  

GIF (size:28M)
-----

[Weather.gif](https://raw.github.com/Mixiaoxiao/Weather/master/Weather.gif)  


Sample APK
-----

[Weather.apk](https://raw.github.com/Mixiaoxiao/Weather/master/Weather.apk)


Features 特性
-----

* Dynamic Weather Background | 动态天气背景：多达10*2种天气效果（区分白天和夜间），60FPS的SurfaceView，切换时平滑渐变
* Custom Weather Views | 天气相关自定义View：一周天气曲线图、24H曲线图、空气质量/风速/日出日落图等
* Custom ViewPager/PagerTitleStrip/EdgeEffect | 自定义的ViewPager/PagerTitleStrip/EdgeEffect：改写support中ViewPager，配套阻尼弹性越界效果(EdgeEffect)和标题指示器(PagerTitleStrip)，SHUWOZHIYAN，那些个靠重写TouchEvent实现的弹性效果都是[知乎友善度]
* Sunny PullRefreshLayout | 为刷新天气而生的下拉刷新：based on baoyongzhang/android-PullRefreshLayout(基于support的SwipeRefreshLayout封装了下拉状态)，自己写了个SunDrawable即下拉状态指示器
* LabelSpinner | 多选项的设置菜单：说实话PopupMenu太不好用了


本项目开源的说明
-----

* 这个本是个差不多已完成的项目，写于2015年11月份，因为api接口和其他一些原因没有发布
* 已删除了个人申请的天气api/定位geo转换的key以及一些和天气效果无关的代码，如什么通知栏、桌面小工具、位置管理之类的
* 放到Github上，供大家，呃，不能说是学习吧，在自定义View方面还是值得一看的
* 天气数据由和风天气提供，Github上的这个内置了3个样例数据，用来模拟效果
* 项目的icon是flyme天气的，天气状态图标也是flyme天气的(有改动)，font数字和英文字体取自MIUI(有改动)，动态天气背景颜色从iOS天气取色
* 最后，能看懂这行字的都知道下面的License只是个很礼貌的摆设


Developed By
------------

* Mixiaoxiao - <xiaochyechye@gmail.com> or <mixiaoxiaogogo@163.com>
* Coding blogs is shit. I just code my codes.


License
-----------

    Copyright 2016 Mixiaoxiao

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
