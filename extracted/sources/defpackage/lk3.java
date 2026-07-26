package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.core.notification.PushMessage;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class lk3 implements ai5 {
    public final DialogDataModel a;
    public final PushMessage b;

    public lk3(DialogDataModel dialogDataModel, PushMessage pushMessage) {
        this.a = dialogDataModel;
        this.b = pushMessage;
    }

    public static final lk3 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", lk3.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("pushMessage")) {
            throw new IllegalArgumentException("Required argument \"pushMessage\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(PushMessage.class) && !Serializable.class.isAssignableFrom(PushMessage.class)) {
            throw new UnsupportedOperationException(PushMessage.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        PushMessage pushMessage = (PushMessage) bundle.get("pushMessage");
        if (pushMessage != null) {
            return new lk3(dialogDataModel, pushMessage);
        }
        throw new IllegalArgumentException("Argument \"pushMessage\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk3)) {
            return false;
        }
        lk3 lk3Var = (lk3) obj;
        return js3.i(this.a, lk3Var.a) && js3.i(this.b, lk3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InAppNotificationDialogFragmentArgs(data=" + this.a + ", pushMessage=" + this.b + ")";
    }
}
