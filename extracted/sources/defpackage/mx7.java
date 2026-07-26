package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.MyketMultiRadio;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mx7 {
    public static nx7 a(Bundle bundle) {
        MyketMultiRadio.Item[] itemArr;
        if (!t61.B(bundle, "bundle", nx7.class, "data")) {
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
        if (!bundle.containsKey("checkBoxItems")) {
            throw new IllegalArgumentException("Required argument \"checkBoxItems\" is missing and does not have an android:defaultValue");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("checkBoxItems");
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                js3.n(parcelable, "null cannot be cast to non-null type ir.mservices.market.views.MyketMultiRadio.Item");
                arrayList.add((MyketMultiRadio.Item) parcelable);
            }
            itemArr = (MyketMultiRadio.Item[]) arrayList.toArray(new MyketMultiRadio.Item[0]);
        } else {
            itemArr = null;
        }
        MyketMultiRadio.Item[] itemArr2 = itemArr;
        if (itemArr2 == null) {
            throw new IllegalArgumentException("Argument \"checkBoxItems\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("checkedItem")) {
            throw new IllegalArgumentException("Required argument \"checkedItem\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("checkedItem");
        if (!bundle.containsKey("theme")) {
            throw new IllegalArgumentException("Required argument \"theme\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ThemeData.class) && !Serializable.class.isAssignableFrom(ThemeData.class)) {
            throw new UnsupportedOperationException(ThemeData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ThemeData themeData = (ThemeData) bundle.get("theme");
        if (themeData != null) {
            return new nx7(dialogDataModel, string, itemArr2, i, themeData);
        }
        throw new IllegalArgumentException("Argument \"theme\" is marked as non-null but was passed a null value.");
    }
}
