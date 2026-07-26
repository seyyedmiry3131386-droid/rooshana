package ir.mservices.market.version2.fragments.dialog;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.ai5;
import defpackage.bl4;
import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import ir.mservices.market.version2.fragments.dialog.PermissionDialogFragment;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;
    public final String d;
    public final PermissionDialogFragment.PermissionList e;

    public c(DialogDataModel dialogDataModel, String str, String str2, String str3, PermissionDialogFragment.PermissionList permissionList) {
        js3.p(str, "title");
        js3.p(str2, "version");
        js3.p(str3, "iconPath");
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = permissionList;
    }

    public static final c fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", c.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("title");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("version")) {
            throw new IllegalArgumentException("Required argument \"version\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("version");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"version\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("iconPath")) {
            throw new IllegalArgumentException("Required argument \"iconPath\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("iconPath");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"iconPath\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("permissions")) {
            throw new IllegalArgumentException("Required argument \"permissions\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(PermissionDialogFragment.PermissionList.class) && !Serializable.class.isAssignableFrom(PermissionDialogFragment.PermissionList.class)) {
            throw new UnsupportedOperationException(PermissionDialogFragment.PermissionList.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        PermissionDialogFragment.PermissionList permissionList = (PermissionDialogFragment.PermissionList) bundle.get("permissions");
        if (permissionList != null) {
            return new c(dialogDataModel, string, string2, string3, permissionList);
        }
        throw new IllegalArgumentException("Argument \"permissions\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return js3.i(this.a, cVar.a) && js3.i(this.b, cVar.b) && js3.i(this.c, cVar.c) && js3.i(this.d, cVar.d) && js3.i(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rm7.k(this.d, rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbD = bl4.D("PermissionDialogFragmentArgs(data=", this.a, ", title=", this.b, ", version=");
        o40.I(this.c, ", iconPath=", this.d, ", permissions=", sbD);
        sbD.append(this.e);
        sbD.append(")");
        return sbD.toString();
    }
}
