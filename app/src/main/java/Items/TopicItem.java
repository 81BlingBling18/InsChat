package Items;

import android.graphics.Bitmap;

import java.util.ArrayList;

import Application.InsChatApplication;

/**
 * Created by QiMeng on 2016/12/20.
 */

public class TopicItem {
    private String imei = InsChatApplication.getUser().getImei();

    //创建Topic的时候需要的属性
    private String title;
    private String content;
    private String wifiName;

    //其他属性
    private String creatorNickName;
    private Bitmap creatorAvatar;
    private int createTime;

    private long topicHashcode;
    private ArrayList<ReplyItem>reaplyList;

    public TopicItem() {

    }
    public TopicItem( String creatorNickName, Bitmap creatorAvatar, int createTime, String title, String content, String wifiName, ArrayList<ReplyItem> reaplyList) {


        this.creatorNickName = creatorNickName;
        this.creatorAvatar = creatorAvatar;
        this.createTime = createTime;
        this.title = title;
        this.content = content;
        this.wifiName = wifiName;
        this.reaplyList = reaplyList;
    }

    public String getImei() {
        return imei;
    }


    public String getCreatorNickName() {
        return creatorNickName;
    }

    public void setCreatorNickName(String creatorNickName) {
        this.creatorNickName = creatorNickName;
    }

    public Bitmap getCreatorAvatar() {
        return creatorAvatar;
    }

    public void setCreatorAvatar(Bitmap creatorAvatar) {
        this.creatorAvatar = creatorAvatar;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitleAndContent(String title,String content) {
        this.title = title;
        this.content= content;
        topicHashcode = title.hashCode() * 2 + content.hashCode();
    }

    public long getTopicHashcode() {
        return topicHashcode;
    }

    public String getContent() {
        return content;
    }



    public String getWifiName() {
        return wifiName;
    }

    public void setWifiName(String wifiName) {
        this.wifiName = wifiName;
    }

    public ArrayList<ReplyItem> getReaplyList() {
        return reaplyList;
    }

    public void setReaplyList(ArrayList<ReplyItem> reaplyList) {
        this.reaplyList = reaplyList;
    }
}
