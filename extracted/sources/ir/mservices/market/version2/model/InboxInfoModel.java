package ir.mservices.market.version2.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import defpackage.lw;
import ir.mservices.market.core.notification.BadPushMessageException;
import ir.mservices.market.core.notification.PushMessage;
import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
@DatabaseTable(tableName = "inbox_info")
public class InboxInfoModel implements Serializable {

    @DatabaseField(columnName = "banner_url")
    private String bannerUrl;

    @DatabaseField(columnName = "bg_color")
    private String bgColor;

    @DatabaseField(columnName = "click_url")
    private String clickUrl;

    @DatabaseField(columnName = "enable_sound")
    private Boolean enableSound;

    @DatabaseField(columnName = "enable_vibrate")
    private Boolean enableVibrate;

    @DatabaseField(columnName = "expiration_date_time")
    private Long expirationDateTime;

    @DatabaseField(columnName = "extra")
    private String extra;

    @DatabaseField(columnName = "icon_url")
    private String iconUrl;

    @DatabaseField(columnName = "inbox_type")
    private String inboxType;

    @DatabaseField(columnName = "is_pop_up")
    private Boolean isPopUp;

    @DatabaseField(columnName = "message")
    private String message;

    @DatabaseField(columnName = "notification_id", id = true, unique = true)
    private String notificationId;

    @DatabaseField(columnName = "operation")
    private String operation;

    @DatabaseField(columnName = "package_name")
    private String packageName;

    @DatabaseField(columnName = "page_title")
    private String pageTitle;

    @DatabaseField(columnName = "read")
    private boolean read;

    @DatabaseField(columnName = "received_date_time")
    private long receivedDateTime;

    @DatabaseField(columnName = "title")
    private String title;

    @DatabaseField(columnName = "type")
    private String type;

    @DatabaseField(columnName = "version_code")
    private Integer versionCode;

    public InboxInfoModel() {
        Boolean bool = Boolean.FALSE;
        this.enableSound = bool;
        this.enableVibrate = bool;
        this.isPopUp = bool;
        this.read = false;
    }

    public static InboxInfoModel v(PushMessage pushMessage) {
        InboxInfoModel inboxInfoModel = new InboxInfoModel();
        inboxInfoModel.notificationId = pushMessage.m();
        inboxInfoModel.title = pushMessage.s();
        inboxInfoModel.message = pushMessage.l();
        inboxInfoModel.bannerUrl = pushMessage.a();
        inboxInfoModel.bgColor = pushMessage.b();
        inboxInfoModel.clickUrl = pushMessage.d();
        inboxInfoModel.iconUrl = pushMessage.i();
        inboxInfoModel.operation = pushMessage.o();
        inboxInfoModel.enableSound = Boolean.valueOf(pushMessage.v());
        inboxInfoModel.enableVibrate = Boolean.valueOf(pushMessage.w());
        inboxInfoModel.pageTitle = pushMessage.q();
        inboxInfoModel.extra = pushMessage.g();
        try {
            Date dateE = pushMessage.e();
            inboxInfoModel.expirationDateTime = dateE != null ? Long.valueOf(dateE.getTime()) : null;
            inboxInfoModel.isPopUp = Boolean.valueOf(pushMessage.x());
            inboxInfoModel.type = pushMessage.t();
            inboxInfoModel.packageName = pushMessage.p();
            inboxInfoModel.versionCode = Integer.valueOf(pushMessage.u());
            inboxInfoModel.inboxType = pushMessage.k();
            inboxInfoModel.receivedDateTime = System.currentTimeMillis();
            inboxInfoModel.read = false;
            return inboxInfoModel;
        } catch (BadPushMessageException e) {
            lw.g(e, null, null);
            return null;
        }
    }

    public final String a() {
        return this.bannerUrl;
    }

    public final String b() {
        return this.bgColor;
    }

    public final String c() {
        return this.clickUrl;
    }

    public final Long e() {
        return this.expirationDateTime;
    }

    public final String f() {
        return this.extra;
    }

    public final String g() {
        return this.iconUrl;
    }

    public final String getType() {
        return this.type;
    }

    public final String h() {
        return this.inboxType;
    }

    public final String i() {
        return this.message;
    }

    public final String j() {
        return this.notificationId;
    }

    public final String k() {
        return this.operation;
    }

    public final String l() {
        return this.packageName;
    }

    public final String m() {
        return this.pageTitle;
    }

    public final long n() {
        return this.receivedDateTime;
    }

    public final String o() {
        return this.title;
    }

    public final int p() {
        return this.versionCode.intValue();
    }

    public final boolean q() {
        return this.enableSound.booleanValue();
    }

    public final boolean r() {
        return this.enableVibrate.booleanValue();
    }

    public final boolean s() {
        return this.isPopUp.booleanValue();
    }

    public final boolean t() {
        return this.read;
    }

    public final String toString() {
        return "InboxInfoModel{notificationId='" + this.notificationId + "', title='" + this.title + "', message='" + this.message + "', bannerUrl='" + this.bannerUrl + "', bgColor='" + this.bgColor + "', clickUrl='" + this.clickUrl + "', iconUrl='" + this.iconUrl + "', operation='" + this.operation + "', enableSound=" + this.enableSound + ", enableVibrate=" + this.enableVibrate + ", pageTitle='" + this.pageTitle + "', extra='" + this.extra + "', expirationDateTime=" + this.expirationDateTime + ", isPopUp=" + this.isPopUp + ", type='" + this.type + "', packageName='" + this.packageName + "', versionCode=" + this.versionCode + '}';
    }

    public final void w() {
        this.read = true;
    }
}
