package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.gateway.GatewayBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class kk3 implements ai5 {
    public final DialogDataModel a;
    public final GatewayBottomDialogFragment.GatewayData b;
    public final String c;

    public kk3(DialogDataModel dialogDataModel, GatewayBottomDialogFragment.GatewayData gatewayData, String str) {
        js3.p(str, "packageName");
        this.a = dialogDataModel;
        this.b = gatewayData;
        this.c = str;
    }

    public static final kk3 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", kk3.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("gatewayData")) {
            throw new IllegalArgumentException("Required argument \"gatewayData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(GatewayBottomDialogFragment.GatewayData.class) && !Serializable.class.isAssignableFrom(GatewayBottomDialogFragment.GatewayData.class)) {
            throw new UnsupportedOperationException(GatewayBottomDialogFragment.GatewayData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        GatewayBottomDialogFragment.GatewayData gatewayData = (GatewayBottomDialogFragment.GatewayData) bundle.get("gatewayData");
        if (gatewayData == null) {
            throw new IllegalArgumentException("Argument \"gatewayData\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("packageName");
        if (string != null) {
            return new kk3(dialogDataModel, gatewayData, string);
        }
        throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk3)) {
            return false;
        }
        kk3 kk3Var = (kk3) obj;
        return js3.i(this.a, kk3Var.a) && js3.i(this.b, kk3Var.b) && js3.i(this.c, kk3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InAppGatewayDialogFragmentArgs(data=");
        sb.append(this.a);
        sb.append(", gatewayData=");
        sb.append(this.b);
        sb.append(", packageName=");
        return dw1.s(sb, this.c, ")");
    }
}
