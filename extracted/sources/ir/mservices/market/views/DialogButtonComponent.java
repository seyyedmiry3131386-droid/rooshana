package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a79;
import defpackage.d04;
import defpackage.f88;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.ki0;
import defpackage.pq6;
import defpackage.rm1;
import defpackage.sj8;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.views.DialogButtonComponent;

/* JADX INFO: loaded from: classes3.dex */
public final class DialogButtonComponent extends Hilt_DialogButtonComponent {
    public static final /* synthetic */ int u = 0;
    public final ki0 s;
    public d04 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogButtonComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = ki0.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        ki0 ki0Var = (ki0) a79.f0(layoutInflaterFrom, js6.buttons_dialog_component, this, true, null);
        js3.o(ki0Var, "inflate(...)");
        this.s = ki0Var;
        ki0Var.w.setTextColor(sj8.b().d);
        setPrimaryColor(sj8.b().c, sj8.b().d);
    }

    public static /* synthetic */ void setTitles$default(DialogButtonComponent dialogButtonComponent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        dialogButtonComponent.setTitles(str, str2);
    }

    public final d04 getLanguageHelper() {
        d04 d04Var = this.t;
        if (d04Var != null) {
            return d04Var;
        }
        js3.V("languageHelper");
        throw null;
    }

    public final void setCancelButtonEnable(boolean z) {
        ki0 ki0Var = this.s;
        ki0Var.w.setEnabled(z);
        ki0Var.v.setClickable(z);
    }

    public final void setCommitButtonEnable(boolean z, int i) {
        ki0 ki0Var = this.s;
        ki0Var.w.setEnabled(z);
        ki0Var.v.setClickable(z);
        if (z) {
            ki0Var.w.setTextColor(i);
        } else {
            ki0Var.w.setTextColor(sj8.b().u);
        }
    }

    public final void setLanguageHelper(d04 d04Var) {
        js3.p(d04Var, "<set-?>");
        this.t = d04Var;
    }

    public final void setOnClickListener(final rm1 rm1Var) {
        ki0 ki0Var = this.s;
        final int i = 0;
        ki0Var.w.setOnClickListener(new View.OnClickListener() { // from class: qm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                rm1 rm1Var2 = rm1Var;
                switch (i2) {
                    case 0:
                        int i3 = DialogButtonComponent.u;
                        if (rm1Var2 != null) {
                            rm1Var2.onCommit();
                        }
                        break;
                    default:
                        int i4 = DialogButtonComponent.u;
                        if (rm1Var2 != null) {
                            rm1Var2.onCancel();
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        ki0Var.v.setOnClickListener(new View.OnClickListener() { // from class: qm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                rm1 rm1Var2 = rm1Var;
                switch (i22) {
                    case 0:
                        int i3 = DialogButtonComponent.u;
                        if (rm1Var2 != null) {
                            rm1Var2.onCommit();
                        }
                        break;
                    default:
                        int i4 = DialogButtonComponent.u;
                        if (rm1Var2 != null) {
                            rm1Var2.onCancel();
                        }
                        break;
                }
            }
        });
    }

    public final void setPrimaryColor(int i, int i2) {
        ki0 ki0Var = this.s;
        ki0Var.v.setColor(i);
        ki0Var.v.setButtonTextColor(i);
        ki0Var.w.setBgColor(i);
        ki0Var.w.setButtonTextColor(i2);
    }

    public final void setStateCancel(MyketProgressState myketProgressState) {
        js3.p(myketProgressState, "state");
        this.s.v.setState(myketProgressState);
    }

    public final void setStateCommit(MyketProgressState myketProgressState) {
        js3.p(myketProgressState, "state");
        this.s.w.setState(myketProgressState);
    }

    public final void setTheme(ThemeData themeData) {
        js3.p(themeData, "themeData");
        ki0 ki0Var = this.s;
        ki0Var.w.setTheme(themeData);
        ki0Var.v.setTheme(themeData);
    }

    public final void setTitles(String str, String str2) {
        ki0 ki0Var = this.s;
        ki0Var.w.setText(str);
        BigFillRectangleButton bigFillRectangleButton = ki0Var.w;
        js3.o(bigFillRectangleButton, "commit");
        boolean z = true;
        int dimensionPixelSize = 0;
        bigFillRectangleButton.setVisibility(!(str == null || f88.n0(str)) ? 0 : 8);
        ki0Var.v.setText(str2);
        BigEmptyRectangleButton bigEmptyRectangleButton = ki0Var.v;
        js3.o(bigEmptyRectangleButton, "cancel");
        if (str2 != null && !f88.n0(str2)) {
            z = false;
        }
        bigEmptyRectangleButton.setVisibility(z ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = ki0Var.w.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (str2 != null && !f88.n0(str2)) {
            dimensionPixelSize = getResources().getDimensionPixelSize(pq6.margin_default_v2);
        }
        if (getLanguageHelper().f()) {
            marginLayoutParams.leftMargin = dimensionPixelSize;
        } else {
            marginLayoutParams.rightMargin = dimensionPixelSize;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogButtonComponent(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
