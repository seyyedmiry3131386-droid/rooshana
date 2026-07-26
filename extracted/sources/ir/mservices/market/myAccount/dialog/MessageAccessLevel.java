package ir.mservices.market.myAccount.dialog;

import defpackage.ql3;
import defpackage.r22;
import defpackage.rs6;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MessageAccessLevel {
    public static final ql3 c;
    public static final MessageAccessLevel d;
    public static final /* synthetic */ MessageAccessLevel[] e;
    public static final /* synthetic */ r22 f;
    public final String a;
    public final int b;

    static {
        MessageAccessLevel messageAccessLevel = new MessageAccessLevel(0, rs6.account_massage_access_level_spinner_title_everyone, "EVERYONE", "Everyone");
        MessageAccessLevel messageAccessLevel2 = new MessageAccessLevel(1, rs6.account_massage_access_level_spinner_title_followers, "FOLLOWERS", "Followers");
        d = messageAccessLevel2;
        MessageAccessLevel[] messageAccessLevelArr = {messageAccessLevel, messageAccessLevel2, new MessageAccessLevel(2, rs6.account_massage_access_level_spinner_title_no_one, "NO_ONE", "NoOne")};
        e = messageAccessLevelArr;
        f = a.a(messageAccessLevelArr);
        c = new ql3();
    }

    public MessageAccessLevel(int i, int i2, String str, String str2) {
        this.a = str2;
        this.b = i2;
    }

    public static MessageAccessLevel valueOf(String str) {
        return (MessageAccessLevel) Enum.valueOf(MessageAccessLevel.class, str);
    }

    public static MessageAccessLevel[] values() {
        return (MessageAccessLevel[]) e.clone();
    }
}
