package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.button.MaterialButton;
import defpackage.fk4;
import defpackage.ft6;
import defpackage.is6;
import defpackage.mt6;
import defpackage.nk4;
import defpackage.pl8;
import defpackage.qr6;
import defpackage.rm7;
import defpackage.u03;
import defpackage.vp6;
import defpackage.yh0;
import defpackage.yt6;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialTimePicker extends DialogFragment {
    public TimePickerView U0;
    public ViewStub V0;
    public g W0;
    public l X0;
    public Object Y0;
    public int Z0;
    public int a1;
    public CharSequence c1;
    public CharSequence e1;
    public CharSequence g1;
    public MaterialButton h1;
    public Button i1;
    public TimeModel k1;
    public final LinkedHashSet Q0 = new LinkedHashSet();
    public final LinkedHashSet R0 = new LinkedHashSet();
    public final LinkedHashSet S0 = new LinkedHashSet();
    public final LinkedHashSet T0 = new LinkedHashSet();
    public int b1 = 0;
    public int d1 = 0;
    public int f1 = 0;
    public int j1 = 0;
    public int l1 = 0;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        Context contextQ0 = q0();
        int i = this.l1;
        if (i == 0) {
            TypedValue typedValueG = yh0.G(q0(), vp6.materialTimePickerTheme);
            i = typedValueG == null ? 0 : typedValueG.data;
        }
        Dialog dialog = new Dialog(contextQ0, i);
        Context context = dialog.getContext();
        fk4 fk4Var = new fk4(context, null, vp6.materialTimePickerStyle, mt6.Widget_MaterialComponents_TimePicker);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, yt6.MaterialTimePicker, vp6.materialTimePickerStyle, mt6.Widget_MaterialComponents_TimePicker);
        this.a1 = typedArrayObtainStyledAttributes.getResourceId(yt6.MaterialTimePicker_clockIcon, 0);
        this.Z0 = typedArrayObtainStyledAttributes.getResourceId(yt6.MaterialTimePicker_keyboardIcon, 0);
        int color = typedArrayObtainStyledAttributes.getColor(yt6.MaterialTimePicker_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        fk4Var.o(context);
        fk4Var.s(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(fk4Var);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        fk4Var.r(window.getDecorView().getElevation());
        return dialog;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, pl8] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, pl8] */
    public final void G0(MaterialButton materialButton) {
        pl8 pl8Var;
        Pair pair;
        if (materialButton == null || this.U0 == null || this.V0 == null) {
            return;
        }
        ?? r0 = this.Y0;
        if (r0 != 0) {
            r0.c();
        }
        int i = this.j1;
        TimePickerView timePickerView = this.U0;
        ViewStub viewStub = this.V0;
        if (i == 0) {
            g gVar = this.W0;
            g gVar2 = gVar;
            if (gVar == null) {
                gVar2 = new g(timePickerView, this.k1);
            }
            this.W0 = gVar2;
            pl8Var = gVar2;
        } else {
            if (this.X0 == null) {
                this.X0 = new l((LinearLayout) viewStub.inflate(), this.k1);
            }
            l lVar = this.X0;
            lVar.e.setChecked(false);
            lVar.f.setChecked(false);
            pl8Var = this.X0;
        }
        this.Y0 = pl8Var;
        pl8Var.a();
        this.Y0.invalidate();
        int i2 = this.j1;
        if (i2 == 0) {
            pair = new Pair(Integer.valueOf(this.Z0), Integer.valueOf(ft6.material_timepicker_text_input_mode_description));
        } else {
            if (i2 != 1) {
                throw new IllegalArgumentException(rm7.n(i2, "no icon for mode: "));
            }
            pair = new Pair(Integer.valueOf(this.a1), Integer.valueOf(ft6.material_timepicker_clock_mode_description));
        }
        materialButton.setIconResource(((Integer) pair.first).intValue());
        materialButton.setContentDescription(K().getString(((Integer) pair.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (bundle == null) {
            bundle = this.g;
        }
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.k1 = timeModel;
        if (timeModel == null) {
            this.k1 = new TimeModel(0, 0, 10, 0);
        }
        this.j1 = bundle.getInt("TIME_PICKER_INPUT_MODE", this.k1.c != 1 ? 0 : 1);
        this.b1 = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.c1 = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.d1 = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.e1 = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.f1 = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.g1 = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.l1 = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(is6.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(qr6.material_timepicker_view);
        this.U0 = timePickerView;
        timePickerView.x = this;
        this.V0 = (ViewStub) viewGroup2.findViewById(qr6.material_textinput_timepicker);
        this.h1 = (MaterialButton) viewGroup2.findViewById(qr6.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(qr6.header_title);
        int i = this.b1;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.c1)) {
            textView.setText(this.c1);
        }
        G0(this.h1);
        Button button = (Button) viewGroup2.findViewById(qr6.material_timepicker_ok_button);
        button.setOnClickListener(new nk4(this, 0));
        int i2 = this.d1;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.e1)) {
            button.setText(this.e1);
        }
        Button button2 = (Button) viewGroup2.findViewById(qr6.material_timepicker_cancel_button);
        this.i1 = button2;
        button2.setOnClickListener(new nk4(this, 1));
        int i3 = this.f1;
        if (i3 != 0) {
            this.i1.setText(i3);
        } else if (!TextUtils.isEmpty(this.g1)) {
            this.i1.setText(this.g1);
        }
        Button button3 = this.i1;
        if (button3 != null) {
            button3.setVisibility(this.G0 ? 0 : 8);
        }
        this.h1.setOnClickListener(new nk4(this, 2));
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.Y0 = null;
        this.W0 = null;
        this.X0 = null;
        TimePickerView timePickerView = this.U0;
        if (timePickerView != null) {
            timePickerView.x = null;
            this.U0 = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void h0(Bundle bundle) {
        super.h0(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.k1);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.j1);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.b1);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.c1);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.d1);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.e1);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.f1);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.g1);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.l1);
    }

    @Override // androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        if (this.Y0 instanceof l) {
            view.postDelayed(new u03(6, this), 100L);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.S0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.T0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }
}
