package ir.myket.movie.common.domain.models;

import defpackage.r22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Orientation {
    public static final Orientation a;
    public static final Orientation b;
    public static final /* synthetic */ Orientation[] c;
    public static final /* synthetic */ r22 d;

    static {
        Orientation orientation = new Orientation("PORT", 0);
        a = orientation;
        Orientation orientation2 = new Orientation("LAND", 1);
        b = orientation2;
        Orientation[] orientationArr = {orientation, orientation2};
        c = orientationArr;
        d = a.a(orientationArr);
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) c.clone();
    }
}
