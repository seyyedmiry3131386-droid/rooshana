package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a79;
import defpackage.bp2;
import defpackage.f88;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.li0;
import defpackage.sj8;
import defpackage.sm1;

/* JADX INFO: loaded from: classes3.dex */
public final class DialogButtonComponentVertical extends LinearLayout {
    public static final /* synthetic */ int b = 0;
    public final li0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogButtonComponentVertical(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = li0.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        li0 li0Var = (li0) a79.f0(layoutInflaterFrom, js6.buttons_dialog_component_vertical, this, true, null);
        js3.o(li0Var, "inflate(...)");
        this.a = li0Var;
        setPrimaryColor(sj8.b().c, sj8.b().d);
    }

    public static /* synthetic */ void setTitles$default(DialogButtonComponentVertical dialogButtonComponentVertical, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        dialogButtonComponentVertical.setTitles(str, str2);
    }

    public final void setCancelButtonEnable(boolean z) {
        li0 li0Var = this.a;
        li0Var.v.setEnabled(z);
        li0Var.v.setClickable(z);
    }

    public final void setCommitButtonEnable(boolean z, int i) {
        li0 li0Var = this.a;
        li0Var.w.setEnabled(z);
        li0Var.v.setClickable(z);
        if (z) {
            li0Var.w.setTextColor(i);
        } else {
            li0Var.w.setTextColor(sj8.b().u);
        }
    }

    public final void setOnCancelClickListener(bp2 bp2Var) {
        js3.p(bp2Var, "onCancel");
        this.a.v.setOnClickListener(new sm1(0, bp2Var));
    }

    public final void setOnCommitClickListener(bp2 bp2Var) {
        js3.p(bp2Var, "onCommit");
        this.a.w.setOnClickListener(new sm1(1, bp2Var));
    }

    public final void setPrimaryColor(int i, int i2) {
        li0 li0Var = this.a;
        li0Var.w.setBgColor(i);
        li0Var.w.setButtonTextColor(i2);
    }

    public final void setStateCommit(MyketProgressState myketProgressState) {
        js3.p(myketProgressState, "state");
        this.a.w.setState(myketProgressState);
    }

    public final void setTitles(String str, String str2) {
        li0 li0Var = this.a;
        BigFillOvalButton bigFillOvalButton = li0Var.w;
        bigFillOvalButton.setText(str);
        boolean z = true;
        bigFillOvalButton.setVisibility(!(str == null || f88.n0(str)) ? 0 : 8);
        MyketTextView myketTextView = li0Var.v;
        myketTextView.setText(str2);
        if (str2 != null && !f88.n0(str2)) {
            z = false;
        }
        myketTextView.setVisibility(z ? 8 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogButtonComponentVertical(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
