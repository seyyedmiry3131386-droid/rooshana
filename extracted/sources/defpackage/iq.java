package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.gateway.GatewayBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class iq implements ai5 {
    public final DialogDataModel a;
    public final GatewayBottomDialogFragment.GatewayData b;
    public final String c;

    public iq(DialogDataModel dialogDataModel, GatewayBottomDialogFragment.GatewayData gatewayData, String str) {
        this.a = dialogDataModel;
        this.b = gatewayData;
        this.c = str;
    }

    public static final iq fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", iq.class, "data")) {
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
        if (bundle.containsKey("iconPath")) {
            return new iq(dialogDataModel, gatewayData, bundle.getString("iconPath"));
        }
        throw new IllegalArgumentException("Required argument \"iconPath\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq)) {
            return false;
        }
        iq iqVar = (iq) obj;
        return js3.i(this.a, iqVar.a) && js3.i(this.b, iqVar.b) && js3.i(this.c, iqVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppGatewayDialogFragmentArgs(data=");
        sb.append(this.a);
        sb.append(", gatewayData=");
        sb.append(this.b);
        sb.append(", iconPath=");
        return dw1.s(sb, this.c, ")");
    }
}
