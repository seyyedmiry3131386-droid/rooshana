package ir.mservices.market.core.notification;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepName;
import defpackage.dw1;
import defpackage.qt4;
import ir.mservices.market.version2.model.InboxInfoModel;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public class PushMessage implements Parcelable {
    public static final Parcelable.Creator<PushMessage> CREATOR = new qt4(29);

    @KeepName
    private String bannerUrl;

    @KeepName
    private String bgColor;

    @KeepName
    private String channelId;

    @KeepName
    private String clickUrl;

    @KeepName
    private String conditionExpirationDate;

    @KeepName
    private String dismissCallbackUrl;

    @KeepName
    private boolean enableSound;

    @KeepName
    private boolean enableVibrate;

    @KeepName
    private String extra;

    @KeepName
    private String extraActions;

    @KeepName
    private String iconUrl;

    @KeepName
    private String impressionCallbackUrl;

    @KeepName
    private String inboxType;

    @KeepName
    private boolean isPopUp;

    @KeepName
    private String message;

    @KeepName
    private String notificationId;

    @KeepName
    @Deprecated
    private String oneSignalNotificationId;

    @KeepName
    private String openCallbackUrl;

    @KeepName
    private String operation;

    @KeepName
    private String packageName;

    @KeepName
    private String pageTitle;

    @KeepName
    private String popUpDisplay;

    @KeepName
    private boolean showPopUpIfBlocked;

    @KeepName
    private String title;

    @KeepName
    private String type;

    @KeepName
    private int versionCode;

    public PushMessage() {
        this.enableSound = false;
        this.enableVibrate = false;
        this.isPopUp = false;
        this.showPopUpIfBlocked = false;
    }

    public static PushMessage A(InboxInfoModel inboxInfoModel) {
        PushMessage pushMessage = new PushMessage();
        pushMessage.notificationId = inboxInfoModel.j();
        pushMessage.title = inboxInfoModel.o();
        pushMessage.message = inboxInfoModel.i();
        pushMessage.bannerUrl = inboxInfoModel.a();
        pushMessage.bgColor = inboxInfoModel.b();
        pushMessage.clickUrl = inboxInfoModel.c();
        pushMessage.iconUrl = inboxInfoModel.g();
        pushMessage.operation = inboxInfoModel.k();
        pushMessage.enableSound = inboxInfoModel.q();
        pushMessage.enableVibrate = inboxInfoModel.r();
        pushMessage.pageTitle = inboxInfoModel.m();
        pushMessage.extra = inboxInfoModel.f();
        if (inboxInfoModel.e() != null) {
            pushMessage.conditionExpirationDate = new SimpleDateFormat("yyyy-MM-dd hh:mm", Locale.US).format(new Date(inboxInfoModel.e().longValue()));
        }
        pushMessage.isPopUp = inboxInfoModel.s();
        pushMessage.type = inboxInfoModel.getType();
        pushMessage.packageName = inboxInfoModel.l();
        pushMessage.versionCode = inboxInfoModel.p();
        pushMessage.inboxType = inboxInfoModel.h();
        pushMessage.openCallbackUrl = null;
        pushMessage.dismissCallbackUrl = null;
        pushMessage.impressionCallbackUrl = null;
        pushMessage.popUpDisplay = "Now";
        pushMessage.extraActions = null;
        pushMessage.channelId = null;
        return pushMessage;
    }

    public final void B(String str) {
        this.clickUrl = str;
    }

    public final void C(String str) {
        this.extraActions = str;
    }

    public final void E(String str) {
        if (TextUtils.isEmpty(this.notificationId)) {
            this.notificationId = str;
        }
    }

    public final void F() {
        this.isPopUp = true;
    }

    public final String a() {
        return this.bannerUrl;
    }

    public final String b() {
        return this.bgColor;
    }

    public final String c() {
        return this.channelId;
    }

    public final String d() {
        return this.clickUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Date e() {
        if (TextUtils.isEmpty(this.conditionExpirationDate)) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("Asia/Tehran"));
        try {
            return simpleDateFormat.parse(this.conditionExpirationDate);
        } catch (ParseException e) {
            throw new BadPushMessageException("Expiration date format is not correct: " + this.conditionExpirationDate, e);
        }
    }

    public final String f() {
        return this.dismissCallbackUrl;
    }

    public final String g() {
        return this.extra;
    }

    public final String h() {
        return this.extraActions;
    }

    public final String i() {
        return this.iconUrl;
    }

    public final String j() {
        return this.impressionCallbackUrl;
    }

    public final String k() {
        String str = this.inboxType;
        String lowerCase = str == null ? "" : str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "box":
            case "both":
            case "notif":
                break;
            default:
                this.inboxType = "both";
                break;
        }
        return this.inboxType;
    }

    public final String l() {
        return this.message;
    }

    public final String m() {
        if (!TextUtils.isEmpty(this.notificationId)) {
            return this.notificationId;
        }
        if (TextUtils.isEmpty(this.oneSignalNotificationId)) {
            return null;
        }
        return this.oneSignalNotificationId;
    }

    public final String n() {
        return this.openCallbackUrl;
    }

    public final String o() {
        return this.operation;
    }

    public final String p() {
        return this.packageName;
    }

    public final String q() {
        return this.pageTitle;
    }

    public final String r() {
        return !TextUtils.isEmpty(this.popUpDisplay) ? this.popUpDisplay : "NextRun";
    }

    public final String s() {
        return this.title;
    }

    public final String t() {
        return !TextUtils.isEmpty(this.type) ? this.type : !TextUtils.isEmpty(this.operation) ? "operation" : "notif";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushMessage{NotificationId='");
        sb.append(this.notificationId);
        sb.append("', title='");
        sb.append(this.title);
        sb.append("', message='");
        sb.append(this.message);
        sb.append("', bannerUrl='");
        sb.append(this.bannerUrl);
        sb.append("', bgColor='");
        sb.append(this.bgColor);
        sb.append("', clickUrl='");
        sb.append(this.clickUrl);
        sb.append("', iconUrl='");
        sb.append(this.iconUrl);
        sb.append("', operation='");
        sb.append(this.operation);
        sb.append("', enableSound=");
        sb.append(this.enableSound);
        sb.append(", enableVibrate=");
        sb.append(this.enableVibrate);
        sb.append(", pageTitle='");
        sb.append(this.pageTitle);
        sb.append("', extra='");
        sb.append(this.extra);
        sb.append("', conditionExpirationDate='");
        sb.append(this.conditionExpirationDate);
        sb.append("', isPopUp=");
        sb.append(this.isPopUp);
        sb.append(", type='");
        sb.append(this.type);
        sb.append("', packageName='");
        sb.append(this.packageName);
        sb.append("', versionCode=");
        sb.append(this.versionCode);
        sb.append(", inboxType='");
        sb.append(this.inboxType);
        sb.append("', openCallbackUrl='");
        sb.append(this.openCallbackUrl);
        sb.append("', dismissCallbackUrl='");
        sb.append(this.dismissCallbackUrl);
        sb.append("', impressionCallbackUrl='");
        return dw1.s(sb, this.impressionCallbackUrl, "'}");
    }

    public final int u() {
        return this.versionCode;
    }

    public final boolean v() {
        return this.enableSound;
    }

    public final boolean w() {
        return this.enableVibrate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(8);
        parcel.writeString(m());
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeString(this.bannerUrl);
        parcel.writeString(this.bgColor);
        parcel.writeString(this.clickUrl);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.operation);
        parcel.writeByte(this.enableSound ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableVibrate ? (byte) 1 : (byte) 0);
        parcel.writeString(this.pageTitle);
        parcel.writeString(this.extra);
        parcel.writeString(this.conditionExpirationDate);
        parcel.writeByte(this.isPopUp ? (byte) 1 : (byte) 0);
        parcel.writeString(this.type);
        parcel.writeString(this.packageName);
        parcel.writeInt(this.versionCode);
        parcel.writeString(this.inboxType);
        parcel.writeString(this.openCallbackUrl);
        parcel.writeString(this.dismissCallbackUrl);
        parcel.writeString(this.impressionCallbackUrl);
        parcel.writeString(this.popUpDisplay);
        parcel.writeString(this.extraActions);
        parcel.writeString(this.channelId);
        parcel.writeByte(this.showPopUpIfBlocked ? (byte) 1 : (byte) 0);
    }

    public final boolean x() {
        return this.isPopUp;
    }

    public final boolean z() {
        return this.showPopUpIfBlocked;
    }

    public PushMessage(Parcel parcel) {
        this.enableSound = false;
        this.enableVibrate = false;
        this.isPopUp = false;
        this.showPopUpIfBlocked = false;
        int i = parcel.readInt();
        if (i == 2) {
            this.notificationId = parcel.readString();
            this.title = parcel.readString();
            this.message = parcel.readString();
            this.bannerUrl = parcel.readString();
            this.bgColor = parcel.readString();
            this.clickUrl = parcel.readString();
            this.iconUrl = parcel.readString();
            this.operation = parcel.readString();
            this.enableSound = parcel.readByte() != 0;
            this.enableVibrate = parcel.readByte() != 0;
            this.pageTitle = parcel.readString();
            this.extra = parcel.readString();
            parcel.readString();
            this.isPopUp = parcel.readByte() != 0;
            this.type = parcel.readString();
            this.packageName = parcel.readString();
            this.versionCode = parcel.readInt();
            this.conditionExpirationDate = null;
            this.inboxType = "notif";
            this.openCallbackUrl = null;
            this.dismissCallbackUrl = null;
            this.impressionCallbackUrl = null;
            this.popUpDisplay = null;
            this.extraActions = null;
            this.channelId = null;
            this.showPopUpIfBlocked = false;
            return;
        }
        if (i == 3) {
            this.notificationId = parcel.readString();
            this.title = parcel.readString();
            this.message = parcel.readString();
            this.bannerUrl = parcel.readString();
            this.bgColor = parcel.readString();
            this.clickUrl = parcel.readString();
            this.iconUrl = parcel.readString();
            this.operation = parcel.readString();
            this.enableSound = parcel.readByte() != 0;
            this.enableVibrate = parcel.readByte() != 0;
            this.pageTitle = parcel.readString();
            this.extra = parcel.readString();
            this.conditionExpirationDate = parcel.readString();
            this.isPopUp = parcel.readByte() != 0;
            this.type = parcel.readString();
            this.packageName = parcel.readString();
            this.versionCode = parcel.readInt();
            this.inboxType = "notif";
            this.openCallbackUrl = null;
            this.dismissCallbackUrl = null;
            this.impressionCallbackUrl = null;
            this.popUpDisplay = null;
            this.extraActions = null;
            this.channelId = null;
            this.showPopUpIfBlocked = false;
            return;
        }
        if (i == 4) {
            this.notificationId = parcel.readString();
            this.title = parcel.readString();
            this.message = parcel.readString();
            this.bannerUrl = parcel.readString();
            this.bgColor = parcel.readString();
            this.clickUrl = parcel.readString();
            this.iconUrl = parcel.readString();
            this.operation = parcel.readString();
            this.enableSound = parcel.readByte() != 0;
            this.enableVibrate = parcel.readByte() != 0;
            this.pageTitle = parcel.readString();
            this.extra = parcel.readString();
            this.conditionExpirationDate = parcel.readString();
            this.isPopUp = parcel.readByte() != 0;
            this.type = parcel.readString();
            this.packageName = parcel.readString();
            this.versionCode = parcel.readInt();
            this.inboxType = parcel.readString();
            this.openCallbackUrl = null;
            this.dismissCallbackUrl = null;
            this.impressionCallbackUrl = null;
            this.popUpDisplay = null;
            this.extraActions = null;
            this.channelId = null;
            this.showPopUpIfBlocked = false;
            return;
        }
        if (i == 5) {
            this.notificationId = parcel.readString();
            this.title = parcel.readString();
            this.message = parcel.readString();
            this.bannerUrl = parcel.readString();
            this.bgColor = parcel.readString();
            this.clickUrl = parcel.readString();
            this.iconUrl = parcel.readString();
            this.operation = parcel.readString();
            this.enableSound = parcel.readByte() != 0;
            this.enableVibrate = parcel.readByte() != 0;
            this.pageTitle = parcel.readString();
            this.extra = parcel.readString();
            this.conditionExpirationDate = parcel.readString();
            this.isPopUp = parcel.readByte() != 0;
            this.type = parcel.readString();
            this.packageName = parcel.readString();
            this.versionCode = parcel.readInt();
            this.inboxType = parcel.readString();
            this.openCallbackUrl = parcel.readString();
            this.dismissCallbackUrl = parcel.readString();
            this.impressionCallbackUrl = null;
            this.popUpDisplay = null;
            this.extraActions = null;
            this.channelId = null;
            this.showPopUpIfBlocked = false;
            return;
        }
        if (i == 6) {
            this.notificationId = parcel.readString();
            this.title = parcel.readString();
            this.message = parcel.readString();
            this.bannerUrl = parcel.readString();
            this.bgColor = parcel.readString();
            this.clickUrl = parcel.readString();
            this.iconUrl = parcel.readString();
            this.operation = parcel.readString();
            this.enableSound = parcel.readByte() != 0;
            this.enableVibrate = parcel.readByte() != 0;
            this.pageTitle = parcel.readString();
            this.extra = parcel.readString();
            this.conditionExpirationDate = parcel.readString();
            this.isPopUp = parcel.readByte() != 0;
            this.type = parcel.readString();
            this.packageName = parcel.readString();
            this.versionCode = parcel.readInt();
            this.inboxType = parcel.readString();
            this.openCallbackUrl = parcel.readString();
            this.dismissCallbackUrl = parcel.readString();
            this.impressionCallbackUrl = parcel.readString();
            this.popUpDisplay = null;
            this.extraActions = null;
            this.channelId = null;
            this.showPopUpIfBlocked = false;
            return;
        }
        if (i == 7) {
            this.notificationId = parcel.readString();
            this.title = parcel.readString();
            this.message = parcel.readString();
            this.bannerUrl = parcel.readString();
            this.bgColor = parcel.readString();
            this.clickUrl = parcel.readString();
            this.iconUrl = parcel.readString();
            this.operation = parcel.readString();
            this.enableSound = parcel.readByte() != 0;
            this.enableVibrate = parcel.readByte() != 0;
            this.pageTitle = parcel.readString();
            this.extra = parcel.readString();
            this.conditionExpirationDate = parcel.readString();
            this.isPopUp = parcel.readByte() != 0;
            this.type = parcel.readString();
            this.packageName = parcel.readString();
            this.versionCode = parcel.readInt();
            this.inboxType = parcel.readString();
            this.openCallbackUrl = parcel.readString();
            this.dismissCallbackUrl = parcel.readString();
            this.impressionCallbackUrl = parcel.readString();
            this.popUpDisplay = parcel.readString();
            this.extraActions = parcel.readString();
            this.channelId = parcel.readString();
            this.showPopUpIfBlocked = false;
            return;
        }
        if (i == 8) {
            this.notificationId = parcel.readString();
            this.title = parcel.readString();
            this.message = parcel.readString();
            this.bannerUrl = parcel.readString();
            this.bgColor = parcel.readString();
            this.clickUrl = parcel.readString();
            this.iconUrl = parcel.readString();
            this.operation = parcel.readString();
            this.enableSound = parcel.readByte() != 0;
            this.enableVibrate = parcel.readByte() != 0;
            this.pageTitle = parcel.readString();
            this.extra = parcel.readString();
            this.conditionExpirationDate = parcel.readString();
            this.isPopUp = parcel.readByte() != 0;
            this.type = parcel.readString();
            this.packageName = parcel.readString();
            this.versionCode = parcel.readInt();
            this.inboxType = parcel.readString();
            this.openCallbackUrl = parcel.readString();
            this.dismissCallbackUrl = parcel.readString();
            this.impressionCallbackUrl = parcel.readString();
            this.popUpDisplay = parcel.readString();
            this.extraActions = parcel.readString();
            this.channelId = parcel.readString();
            this.showPopUpIfBlocked = parcel.readByte() != 0;
        }
    }
}
