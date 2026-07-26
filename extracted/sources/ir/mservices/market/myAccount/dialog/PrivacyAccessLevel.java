package ir.mservices.market.myAccount.dialog;

import defpackage.ol3;
import defpackage.r22;
import defpackage.rs6;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class PrivacyAccessLevel {
    public static final ol3 c;
    public static final PrivacyAccessLevel d;
    public static final /* synthetic */ PrivacyAccessLevel[] e;
    public static final /* synthetic */ r22 f;
    public final String a;
    public final int b;

    static {
        PrivacyAccessLevel privacyAccessLevel = new PrivacyAccessLevel(0, rs6.account_access_level_spinner_title_everyone, "EVERYONE", "Everyone");
        PrivacyAccessLevel privacyAccessLevel2 = new PrivacyAccessLevel(1, rs6.account_access_level_spinner_title_followers, "FOLLOWERS", "Followers");
        d = privacyAccessLevel2;
        PrivacyAccessLevel[] privacyAccessLevelArr = {privacyAccessLevel, privacyAccessLevel2, new PrivacyAccessLevel(2, rs6.account_access_level_spinner_title_no_one, "NO_ONE", "NoOne")};
        e = privacyAccessLevelArr;
        f = a.a(privacyAccessLevelArr);
        c = new ol3(17);
    }

    public PrivacyAccessLevel(int i, int i2, String str, String str2) {
        this.a = str2;
        this.b = i2;
    }

    public static PrivacyAccessLevel valueOf(String str) {
        return (PrivacyAccessLevel) Enum.valueOf(PrivacyAccessLevel.class, str);
    }

    public static PrivacyAccessLevel[] values() {
        return (PrivacyAccessLevel[]) e.clone();
    }
}
