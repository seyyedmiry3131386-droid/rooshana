package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.ui.recycler.data.LineMenuItemData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class c74 implements ai5 {
    public final DialogDataModel a;
    public final LineMenuItemData[] b;
    public final String c;

    public c74(DialogDataModel dialogDataModel, LineMenuItemData[] lineMenuItemDataArr, String str) {
        js3.p(lineMenuItemDataArr, "lineMenuData");
        this.a = dialogDataModel;
        this.b = lineMenuItemDataArr;
        this.c = str;
    }

    public static final c74 fromBundle(Bundle bundle) {
        LineMenuItemData[] lineMenuItemDataArr;
        if (!t61.B(bundle, "bundle", c74.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("lineMenuData")) {
            throw new IllegalArgumentException("Required argument \"lineMenuData\" is missing and does not have an android:defaultValue");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("lineMenuData");
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                js3.n(parcelable, "null cannot be cast to non-null type ir.mservices.market.version2.ui.recycler.data.LineMenuItemData");
                arrayList.add((LineMenuItemData) parcelable);
            }
            lineMenuItemDataArr = (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]);
        } else {
            lineMenuItemDataArr = null;
        }
        if (lineMenuItemDataArr == null) {
            throw new IllegalArgumentException("Argument \"lineMenuData\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("title")) {
            return new c74(dialogDataModel, lineMenuItemDataArr, bundle.getString("title"));
        }
        throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c74)) {
            return false;
        }
        c74 c74Var = (c74) obj;
        return js3.i(this.a, c74Var.a) && js3.i(this.b, c74Var.b) && js3.i(this.c, c74Var.c);
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + Arrays.hashCode(this.b)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return dw1.s(bl4.D("LineMenuBottomDialogFragmentArgs(data=", this.a, ", lineMenuData=", Arrays.toString(this.b), ", title="), this.c, ")");
    }
}
