package ir.mservices.market.myAccount.dialog;

import defpackage.cv;
import defpackage.r22;
import defpackage.rs6;
import defpackage.yq6;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Gender {
    public static final cv d;
    public static final Gender e;
    public static final Gender f;
    public static final /* synthetic */ Gender[] g;
    public static final /* synthetic */ r22 h;
    public final String a;
    public final int b;
    public final int c;

    static {
        Gender gender = new Gender(0, rs6.male, yq6.ic_boy, "MALE", "Male");
        e = gender;
        Gender gender2 = new Gender(1, rs6.female, yq6.ic_girl, "FEMALE", "Female");
        f = gender2;
        Gender[] genderArr = {gender, gender2};
        g = genderArr;
        h = a.a(genderArr);
        d = new cv(24);
    }

    public Gender(int i, int i2, int i3, String str, String str2) {
        this.a = str2;
        this.b = i2;
        this.c = i3;
    }

    public static Gender valueOf(String str) {
        return (Gender) Enum.valueOf(Gender.class, str);
    }

    public static Gender[] values() {
        return (Gender[]) g.clone();
    }
}
