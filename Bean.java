package bawei.com.homework;

import java.util.List;

/**
 * Created by huanhuan on 2017/4/26.
 */

public class Bean {

    /**
     * reason : 查询成功
     * result : {"title":"康熙王朝","tag":"古装 / 宫廷","act":"陈道明 高兰村 斯琴高娃 茹萍 李建群 薛中锐 胡天鸽 廖京生 李洪涛 刘钧 宫雪花 朱晏 安亚平 刘大印 芦勇 曹永祥 苏廷石 侯永生 朱艺丹 姚长安 宋来运 刘毓滨 万中良 郝铁男 崔岱 博弘 王也天 李晨涛 汤加丽 张晶晶","year":"2000","rating":null,"area":"大陆","dir":"陈家林 / 刘大印","desc":"《康熙王朝》又名《康熙帝国》，第一次以正剧的角度浓墨重彩刻画了清朝初期康熙皇帝充满传奇的一生。是一部以史实为依托的鸿篇巨制，囊括了康熙在位期间最重要的历史事件：擒鳌拜、撤三藩、收复台湾等\u2026\u2026","cover":"http://p0.qhimg.com/t0168adfdae3e4c1912.jpg","vdo_status":"play","playlinks":{"cntv":"http://tv.cntv.cn/video/C10703/56612eb2e14d4f199614d2beb80955e4","huashu":"http://www.wasu.cn/Play/show/chn/9001/id/613135?refer=sll","imgo":"http://www.mgtv.com/b/4961/366016.html?cxid=90f0zbamf","leshi":"http://www.le.com/ptv/vplay/1893950.html?ch=360_kan","sohu":"http://tv.sohu.com/20160428/n446640738.shtml?txid=4e4df35dda9d8ed32c874b1ad590ef59","tudou":"http://www.tudou.com/albumplay/eCinCcJvbuQ/e5jwL6lbFzU.html?tpa=dW5pb25faWQ9MTAyMjEzXzEwMDAwMV8wMV8wMQ","youku":"http://v.youku.com/v_show/id_XMTE0NDQ1NTI4.html?tpa=dW5pb25faWQ9MTAyMjEzXzEwMDAwNl8wMV8wMQ"},"video_rec":[{"cover":"http://p8.qhimg.com/t01978f319c02008850.jpg","detail_url":"http://www.360kan.com/tv/Q4Jxc33oTzHtMH.html","title":"康熙王朝50集版"},{"cover":"http://p8.qhimg.com/d/dy_246ebc01df06ec3dad5ec305ffae778e.jpg","detail_url":"http://www.360kan.com/tv/QLpsaq4ZSmTsMn.html","title":"北洋水师"},{"cover":"http://p4.qhimg.com/t0106d6b869835a43e6.jpg","detail_url":"http://www.360kan.com/tv/QbpqcKfZdGTmNX.html","title":"尚方宝剑"},{"cover":"http://p4.qhimg.com/t0155368a9f8f39cf38.jpg","detail_url":"http://www.360kan.com/tv/R4prbKeoRG8lM3.html","title":"江山风雨情"},{"cover":"http://p2.qhimg.com/d/dy_890e8189cbfa1febad76f90749865eaf.jpg","detail_url":"http://www.360kan.com/tv/PLNxcH7kRmLnMX.html","title":"康熙王朝 TV版"}],"act_s":[{"name":"陈道明","url":null,"image":"http://p1.qhmsg.com/dmsmty/120_110_100/t01f7d03afd24e46026.jpg"},{"name":"高兰村","url":null,"image":"http://p6.qhmsg.com/dmsmty/120_110_100/t01859a15f7d37329ab.jpg"},{"name":"斯琴高娃","url":null,"image":"http://p8.qhmsg.com/dmsmty/120_110_100/t01c169430a3a911af2.jpg"},{"name":"茹萍","url":null,"image":"http://p8.qhmsg.com/dmsmty/120_110_100/t017921df553c09b2d2.jpg"},{"name":"李建群","url":null,"image":"http://p3.qhmsg.com/dmsmty/120_110_100/t012e8c9ad21c53a282.png"},{"name":"薛中锐","url":null,"image":"http://p8.qhmsg.com/dmsmty/120_110_100/t0182caedbb9f35f19c.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * title : 康熙王朝
         * tag : 古装 / 宫廷
         * act : 陈道明 高兰村 斯琴高娃 茹萍 李建群 薛中锐 胡天鸽 廖京生 李洪涛 刘钧 宫雪花 朱晏 安亚平 刘大印 芦勇 曹永祥 苏廷石 侯永生 朱艺丹 姚长安 宋来运 刘毓滨 万中良 郝铁男 崔岱 博弘 王也天 李晨涛 汤加丽 张晶晶
         * year : 2000
         * rating : null
         * area : 大陆
         * dir : 陈家林 / 刘大印
         * desc : 《康熙王朝》又名《康熙帝国》，第一次以正剧的角度浓墨重彩刻画了清朝初期康熙皇帝充满传奇的一生。是一部以史实为依托的鸿篇巨制，囊括了康熙在位期间最重要的历史事件：擒鳌拜、撤三藩、收复台湾等……
         * cover : http://p0.qhimg.com/t0168adfdae3e4c1912.jpg
         * vdo_status : play
         * playlinks : {"cntv":"http://tv.cntv.cn/video/C10703/56612eb2e14d4f199614d2beb80955e4","huashu":"http://www.wasu.cn/Play/show/chn/9001/id/613135?refer=sll","imgo":"http://www.mgtv.com/b/4961/366016.html?cxid=90f0zbamf","leshi":"http://www.le.com/ptv/vplay/1893950.html?ch=360_kan","sohu":"http://tv.sohu.com/20160428/n446640738.shtml?txid=4e4df35dda9d8ed32c874b1ad590ef59","tudou":"http://www.tudou.com/albumplay/eCinCcJvbuQ/e5jwL6lbFzU.html?tpa=dW5pb25faWQ9MTAyMjEzXzEwMDAwMV8wMV8wMQ","youku":"http://v.youku.com/v_show/id_XMTE0NDQ1NTI4.html?tpa=dW5pb25faWQ9MTAyMjEzXzEwMDAwNl8wMV8wMQ"}
         * video_rec : [{"cover":"http://p8.qhimg.com/t01978f319c02008850.jpg","detail_url":"http://www.360kan.com/tv/Q4Jxc33oTzHtMH.html","title":"康熙王朝50集版"},{"cover":"http://p8.qhimg.com/d/dy_246ebc01df06ec3dad5ec305ffae778e.jpg","detail_url":"http://www.360kan.com/tv/QLpsaq4ZSmTsMn.html","title":"北洋水师"},{"cover":"http://p4.qhimg.com/t0106d6b869835a43e6.jpg","detail_url":"http://www.360kan.com/tv/QbpqcKfZdGTmNX.html","title":"尚方宝剑"},{"cover":"http://p4.qhimg.com/t0155368a9f8f39cf38.jpg","detail_url":"http://www.360kan.com/tv/R4prbKeoRG8lM3.html","title":"江山风雨情"},{"cover":"http://p2.qhimg.com/d/dy_890e8189cbfa1febad76f90749865eaf.jpg","detail_url":"http://www.360kan.com/tv/PLNxcH7kRmLnMX.html","title":"康熙王朝 TV版"}]
         * act_s : [{"name":"陈道明","url":null,"image":"http://p1.qhmsg.com/dmsmty/120_110_100/t01f7d03afd24e46026.jpg"},{"name":"高兰村","url":null,"image":"http://p6.qhmsg.com/dmsmty/120_110_100/t01859a15f7d37329ab.jpg"},{"name":"斯琴高娃","url":null,"image":"http://p8.qhmsg.com/dmsmty/120_110_100/t01c169430a3a911af2.jpg"},{"name":"茹萍","url":null,"image":"http://p8.qhmsg.com/dmsmty/120_110_100/t017921df553c09b2d2.jpg"},{"name":"李建群","url":null,"image":"http://p3.qhmsg.com/dmsmty/120_110_100/t012e8c9ad21c53a282.png"},{"name":"薛中锐","url":null,"image":"http://p8.qhmsg.com/dmsmty/120_110_100/t0182caedbb9f35f19c.jpg"}]
         */

        private String title;
        private String tag;
        private String act;
        private String year;
        private Object rating;
        private String area;
        private String dir;
        private String desc;
        private String cover;
        private String vdo_status;
        private PlaylinksBean playlinks;
        private List<VideoRecBean> video_rec;
        private List<ActSBean> act_s;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getAct() {
            return act;
        }

        public void setAct(String act) {
            this.act = act;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public Object getRating() {
            return rating;
        }

        public void setRating(Object rating) {
            this.rating = rating;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getDir() {
            return dir;
        }

        public void setDir(String dir) {
            this.dir = dir;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getVdo_status() {
            return vdo_status;
        }

        public void setVdo_status(String vdo_status) {
            this.vdo_status = vdo_status;
        }

        public PlaylinksBean getPlaylinks() {
            return playlinks;
        }

        public void setPlaylinks(PlaylinksBean playlinks) {
            this.playlinks = playlinks;
        }

        public List<VideoRecBean> getVideo_rec() {
            return video_rec;
        }

        public void setVideo_rec(List<VideoRecBean> video_rec) {
            this.video_rec = video_rec;
        }

        public List<ActSBean> getAct_s() {
            return act_s;
        }

        public void setAct_s(List<ActSBean> act_s) {
            this.act_s = act_s;
        }

        public static class PlaylinksBean {
            /**
             * cntv : http://tv.cntv.cn/video/C10703/56612eb2e14d4f199614d2beb80955e4
             * huashu : http://www.wasu.cn/Play/show/chn/9001/id/613135?refer=sll
             * imgo : http://www.mgtv.com/b/4961/366016.html?cxid=90f0zbamf
             * leshi : http://www.le.com/ptv/vplay/1893950.html?ch=360_kan
             * sohu : http://tv.sohu.com/20160428/n446640738.shtml?txid=4e4df35dda9d8ed32c874b1ad590ef59
             * tudou : http://www.tudou.com/albumplay/eCinCcJvbuQ/e5jwL6lbFzU.html?tpa=dW5pb25faWQ9MTAyMjEzXzEwMDAwMV8wMV8wMQ
             * youku : http://v.youku.com/v_show/id_XMTE0NDQ1NTI4.html?tpa=dW5pb25faWQ9MTAyMjEzXzEwMDAwNl8wMV8wMQ
             */

            private String cntv;
            private String huashu;
            private String imgo;
            private String leshi;
            private String sohu;
            private String tudou;
            private String youku;

            public String getCntv() {
                return cntv;
            }

            public void setCntv(String cntv) {
                this.cntv = cntv;
            }

            public String getHuashu() {
                return huashu;
            }

            public void setHuashu(String huashu) {
                this.huashu = huashu;
            }

            public String getImgo() {
                return imgo;
            }

            public void setImgo(String imgo) {
                this.imgo = imgo;
            }

            public String getLeshi() {
                return leshi;
            }

            public void setLeshi(String leshi) {
                this.leshi = leshi;
            }

            public String getSohu() {
                return sohu;
            }

            public void setSohu(String sohu) {
                this.sohu = sohu;
            }

            public String getTudou() {
                return tudou;
            }

            public void setTudou(String tudou) {
                this.tudou = tudou;
            }

            public String getYouku() {
                return youku;
            }

            public void setYouku(String youku) {
                this.youku = youku;
            }
        }

        public static class VideoRecBean {
            /**
             * cover : http://p8.qhimg.com/t01978f319c02008850.jpg
             * detail_url : http://www.360kan.com/tv/Q4Jxc33oTzHtMH.html
             * title : 康熙王朝50集版
             */

            private String cover;
            private String detail_url;
            private String title;

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getDetail_url() {
                return detail_url;
            }

            public void setDetail_url(String detail_url) {
                this.detail_url = detail_url;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class ActSBean {
            /**
             * name : 陈道明
             * url : null
             * image : http://p1.qhmsg.com/dmsmty/120_110_100/t01f7d03afd24e46026.jpg
             */

            private String name;
            private Object url;
            private String image;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Object getUrl() {
                return url;
            }

            public void setUrl(Object url) {
                this.url = url;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }
        }
    }
}
