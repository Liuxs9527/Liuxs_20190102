package com.bwie.administrator.liuxs_20190102.data.bean;


import java.util.List;

public class NewsBean {

    public String msg;
    public String code;
    public DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        public MiaoshaBean miaosha;
        public TuijianBean tuijian;
        public List<BannerBean> banner;
        public List<FenleiBean> fenlei;

        public MiaoshaBean getMiaosha() {
            return miaosha;
        }

        public void setMiaosha(MiaoshaBean miaosha) {
            this.miaosha = miaosha;
        }

        public TuijianBean getTuijian() {
            return tuijian;
        }

        public void setTuijian(TuijianBean tuijian) {
            this.tuijian = tuijian;
        }

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public List<FenleiBean> getFenlei() {
            return fenlei;
        }

        public void setFenlei(List<FenleiBean> fenlei) {
            this.fenlei = fenlei;
        }

        public static class MiaoshaBean {

            public String name;
            public int time;
            public List<ListBean> list;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getTime() {
                return time;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean {

                public double bargainPrice;
                public String createtime;
                public String detailUrl;
                public String images;
                public int itemtype;
                public int pid;
                public double price;
                public int pscid;
                public int salenum;
                public int sellerid;
                public String subhead;
                public String title;

                public double getBargainPrice() {
                    return bargainPrice;
                }

                public void setBargainPrice(double bargainPrice) {
                    this.bargainPrice = bargainPrice;
                }

                public String getCreatetime() {
                    return createtime;
                }

                public void setCreatetime(String createtime) {
                    this.createtime = createtime;
                }

                public String getDetailUrl() {
                    return detailUrl;
                }

                public void setDetailUrl(String detailUrl) {
                    this.detailUrl = detailUrl;
                }

                public String getImages() {
                    return images;
                }

                public void setImages(String images) {
                    this.images = images;
                }

                public int getItemtype() {
                    return itemtype;
                }

                public void setItemtype(int itemtype) {
                    this.itemtype = itemtype;
                }

                public int getPid() {
                    return pid;
                }

                public void setPid(int pid) {
                    this.pid = pid;
                }

                public double getPrice() {
                    return price;
                }

                public void setPrice(double price) {
                    this.price = price;
                }

                public int getPscid() {
                    return pscid;
                }

                public void setPscid(int pscid) {
                    this.pscid = pscid;
                }

                public int getSalenum() {
                    return salenum;
                }

                public void setSalenum(int salenum) {
                    this.salenum = salenum;
                }

                public int getSellerid() {
                    return sellerid;
                }

                public void setSellerid(int sellerid) {
                    this.sellerid = sellerid;
                }

                public String getSubhead() {
                    return subhead;
                }

                public void setSubhead(String subhead) {
                    this.subhead = subhead;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }
            }
        }

        public static class TuijianBean {

            public String name;
            public List<ListBeanX> list;

            public static class ListBeanX {

                public double bargainPrice;
                public String createtime;
                public String detailUrl;
                public String images;
                public int itemtype;
                public int pid;
                public double price;
                public int pscid;
                public int salenum;
                public int sellerid;
                public String subhead;
                public String title;
            }
        }

        public static class BannerBean {


            public int aid;
            public String createtime;
            public String icon;
            public Object productId;
            public String title;
            public int type;
            public String url;
        }

        public static class FenleiBean {

            public int cid;
            public String createtime;
            public String icon;
            public int ishome;
            public String name;
        }
    }
}
