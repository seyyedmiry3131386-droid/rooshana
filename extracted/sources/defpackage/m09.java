package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.UrlDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class m09 implements ai5 {
    public final DialogDataModel a;
    public final UrlDataModel b;
    public final String c;

    public m09(DialogDataModel dialogDataModel, UrlDataModel urlDataModel, String str) {
        js3.p(str, "TextButton");
        this.a = dialogDataModel;
        this.b = urlDataModel;
        this.c = str;
    }

    public static final m09 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", m09.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("urlData")) {
            throw new IllegalArgumentException("Required argument \"urlData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(UrlDataModel.class) && !Serializable.class.isAssignableFrom(UrlDataModel.class)) {
            throw new UnsupportedOperationException(UrlDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        UrlDataModel urlDataModel = (UrlDataModel) bundle.get("urlData");
        if (urlDataModel == null) {
            throw new IllegalArgumentException("Argument \"urlData\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("TextButton")) {
            throw new IllegalArgumentException("Required argument \"TextButton\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("TextButton");
        if (string != null) {
            return new m09(dialogDataModel, urlDataModel, string);
        }
        throw new IllegalArgumentException("Argument \"TextButton\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m09)) {
            return false;
        }
        m09 m09Var = (m09) obj;
        return js3.i(this.a, m09Var.a) && js3.i(this.b, m09Var.b) && js3.i(this.c, m09Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UrlAlertDialogFragmentArgs(data=");
        sb.append(this.a);
        sb.append(", urlData=");
        sb.append(this.b);
        sb.append(", TextButton=");
        return dw1.s(sb, this.c, ")");
    }
}
