package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.screenshots.ScreenshotData;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class bv1 implements ai5 {
    public final int a;
    public final String b;
    public final String c;
    public final ScreenshotData[] d;
    public final int[] e;

    public bv1(int i, String str, String str2, ScreenshotData[] screenshotDataArr, int[] iArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = screenshotDataArr;
        this.e = iArr;
    }

    public static final bv1 fromBundle(Bundle bundle) {
        ScreenshotData[] screenshotDataArr;
        if (!t61.B(bundle, "bundle", bv1.class, "position")) {
            throw new IllegalArgumentException("Required argument \"position\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("position");
        if (!bundle.containsKey("contextInfo")) {
            throw new IllegalArgumentException("Required argument \"contextInfo\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("contextInfo");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"contextInfo\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("title");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("images")) {
            throw new IllegalArgumentException("Required argument \"images\" is missing and does not have an android:defaultValue");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("images");
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                js3.n(parcelable, "null cannot be cast to non-null type ir.mservices.market.screenshots.ScreenshotData");
                arrayList.add((ScreenshotData) parcelable);
            }
            screenshotDataArr = (ScreenshotData[]) arrayList.toArray(new ScreenshotData[0]);
        } else {
            screenshotDataArr = null;
        }
        ScreenshotData[] screenshotDataArr2 = screenshotDataArr;
        if (screenshotDataArr2 == null) {
            throw new IllegalArgumentException("Argument \"images\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("touchPoint")) {
            throw new IllegalArgumentException("Required argument \"touchPoint\" is missing and does not have an android:defaultValue");
        }
        int[] intArray = bundle.getIntArray("touchPoint");
        if (intArray != null) {
            return new bv1(i, string, string2, screenshotDataArr2, intArray);
        }
        throw new IllegalArgumentException("Argument \"touchPoint\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv1)) {
            return false;
        }
        bv1 bv1Var = (bv1) obj;
        return this.a == bv1Var.a && js3.i(this.b, bv1Var.b) && js3.i(this.c, bv1Var.c) && js3.i(this.d, bv1Var.d) && js3.i(this.e, bv1Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((rm7.k(this.c, rm7.k(this.b, this.a * 31, 31), 31) + Arrays.hashCode(this.d)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.d);
        String string2 = Arrays.toString(this.e);
        StringBuilder sb = new StringBuilder("DraggableScreenshotFragmentArgs(position=");
        sb.append(this.a);
        sb.append(", contextInfo=");
        sb.append(this.b);
        sb.append(", title=");
        o40.I(this.c, ", images=", string, ", touchPoint=", sb);
        return dw1.s(sb, string2, ")");
    }
}
