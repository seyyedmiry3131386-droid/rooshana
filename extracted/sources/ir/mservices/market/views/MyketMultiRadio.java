package ir.mservices.market.views;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import defpackage.d04;
import defpackage.js3;
import defpackage.lx7;
import defpackage.sj8;
import defpackage.u91;
import defpackage.ue5;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.SingleSelectBottomDialogFragment;
import ir.myket.core.utils.StringParcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketMultiRadio extends Hilt_MyketMultiRadio implements View.OnClickListener {
    public d04 c;
    public ArrayList d;
    public final LayoutInflater e;
    public lx7 f;
    public int g;
    public ThemeData h;

    public static final class Item implements Parcelable {
        public static final Parcelable.Creator<Item> CREATOR = new b();
        public String a;
        public Parcelable b;
        public String c;
        public String d;
        public String e;
        public String f;
        public Boolean g;
        public Boolean h;

        public Item(String str, StringParcelable stringParcelable, String str2, Boolean bool, int i) {
            Boolean bool2 = Boolean.TRUE;
            bool = (i & 128) != 0 ? null : bool;
            this.a = str;
            this.b = stringParcelable;
            this.c = str2;
            this.d = "";
            this.e = "";
            this.f = "";
            this.g = bool2;
            this.h = bool;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            js3.p(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            Boolean bool = this.g;
            Boolean bool2 = Boolean.TRUE;
            parcel.writeByte(js3.i(bool, bool2) ? (byte) 1 : (byte) 0);
            parcel.writeByte(js3.i(this.h, bool2) ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketMultiRadio(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    public final d04 getLanguageHelper() {
        d04 d04Var = this.c;
        if (d04Var != null) {
            return d04Var;
        }
        js3.V("languageHelper");
        throw null;
    }

    public final ThemeData getTheme() {
        return this.h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        js3.p(view, "view");
        lx7 lx7Var = this.f;
        if (lx7Var != null) {
            int id = view.getId();
            Item item = (Item) this.d.get(view.getId());
            js3.p(item, "selectedItem");
            SingleSelectBottomDialogFragment singleSelectBottomDialogFragment = lx7Var.a;
            Bundle bundle = new Bundle();
            bundle.putParcelable("ITEM", item);
            bundle.putInt("BUNDLE_KEY_SELECTED_ITEM", id);
            singleSelectBottomDialogFragment.R0(DialogResult.a, bundle);
        }
    }

    public final void setLanguageHelper(d04 d04Var) {
        js3.p(d04Var, "<set-?>");
        this.c = d04Var;
    }

    public final void setTheme(ThemeData themeData) {
        js3.p(themeData, "<set-?>");
        this.h = themeData;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketMultiRadio(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    public /* synthetic */ MyketMultiRadio(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketMultiRadio(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            this.c = (d04) ((u91) ((ue5) e())).a.p.get();
        }
        this.d = new ArrayList();
        this.h = sj8.b();
        setOrientation(1);
        setSaveFromParentEnabled(false);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        js3.o(layoutInflaterFrom, "from(...)");
        this.e = layoutInflaterFrom;
    }
}
