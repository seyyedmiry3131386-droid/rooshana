package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.e29;
import defpackage.fk4;
import defpackage.ft6;
import defpackage.h69;
import defpackage.h76;
import defpackage.hl5;
import defpackage.is6;
import defpackage.j97;
import defpackage.jg0;
import defpackage.m91;
import defpackage.mf9;
import defpackage.mo3;
import defpackage.mt6;
import defpackage.nf9;
import defpackage.of9;
import defpackage.oq6;
import defpackage.p40;
import defpackage.pf9;
import defpackage.q69;
import defpackage.qr6;
import defpackage.rf0;
import defpackage.sv0;
import defpackage.te;
import defpackage.vp6;
import defpackage.xq6;
import defpackage.yh0;
import defpackage.yt6;
import defpackage.zj4;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDatePicker<S> extends DialogFragment {
    public final LinkedHashSet Q0 = new LinkedHashSet();
    public final LinkedHashSet R0 = new LinkedHashSet();
    public final LinkedHashSet S0 = new LinkedHashSet();
    public final LinkedHashSet T0 = new LinkedHashSet();
    public int U0;
    public DateSelector V0;
    public h76 W0;
    public CalendarConstraints X0;
    public DayViewDecorator Y0;
    public MaterialCalendar Z0;
    public int a1;
    public CharSequence b1;
    public boolean c1;
    public int d1;
    public int e1;
    public CharSequence f1;
    public int g1;
    public CharSequence h1;
    public int i1;
    public CharSequence j1;
    public int k1;
    public CharSequence l1;
    public TextView m1;
    public TextView n1;
    public CheckableImageButton o1;
    public fk4 p1;
    public Button q1;
    public boolean r1;
    public CharSequence s1;
    public CharSequence t1;

    public static int H0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(oq6.mtrl_calendar_content_padding);
        Month month = new Month(e29.h());
        int dimensionPixelSize = resources.getDimensionPixelSize(oq6.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(oq6.mtrl_calendar_month_horizontal_padding);
        int i = month.d;
        return ((i - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i) + (dimensionPixelOffset * 2);
    }

    public static boolean I0(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(yh0.J(vp6.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        Context contextQ0 = q0();
        Context contextQ02 = q0();
        int iF0 = this.U0;
        if (iF0 == 0) {
            iF0 = G0().F0(contextQ02);
        }
        Dialog dialog = new Dialog(contextQ0, iF0);
        Context context = dialog.getContext();
        this.c1 = I0(context, R.attr.windowFullscreen);
        this.p1 = new fk4(context, null, vp6.materialCalendarStyle, mt6.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, yt6.MaterialCalendar, vp6.materialCalendarStyle, mt6.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(yt6.MaterialCalendar_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.p1.o(context);
        this.p1.s(ColorStateList.valueOf(color));
        this.p1.r(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public final DateSelector G0() {
        if (this.V0 == null) {
            this.V0 = (DateSelector) this.g.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.V0;
    }

    public final void J0() {
        Context contextQ0 = q0();
        int iF0 = this.U0;
        if (iF0 == 0) {
            iF0 = G0().F0(contextQ0);
        }
        DateSelector dateSelectorG0 = G0();
        CalendarConstraints calendarConstraints = this.X0;
        DayViewDecorator dayViewDecorator = this.Y0;
        MaterialCalendar materialCalendar = new MaterialCalendar();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iF0);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelectorG0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.d);
        materialCalendar.u0(bundle);
        this.Z0 = materialCalendar;
        h76 h76Var = materialCalendar;
        if (this.d1 == 1) {
            DateSelector dateSelectorG02 = G0();
            CalendarConstraints calendarConstraints2 = this.X0;
            MaterialTextInputPicker materialTextInputPicker = new MaterialTextInputPicker();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iF0);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelectorG02);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            materialTextInputPicker.u0(bundle2);
            h76Var = materialTextInputPicker;
        }
        this.W0 = h76Var;
        this.m1.setText((this.d1 == 1 && K().getConfiguration().orientation == 2) ? this.t1 : this.s1);
        String strY = G0().y(H());
        this.n1.setContentDescription(G0().C0(q0()));
        this.n1.setText(strY);
        androidx.fragment.app.g gVarG = G();
        gVarG.getClass();
        p40 p40Var = new p40(gVarG);
        p40Var.k(qr6.mtrl_calendar_frame, this.W0, null);
        p40Var.g();
        this.W0.z0(new zj4(0, this));
    }

    public final void K0(CheckableImageButton checkableImageButton) {
        this.o1.setContentDescription(this.d1 == 1 ? checkableImageButton.getContext().getString(ft6.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(ft6.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (bundle == null) {
            bundle = this.g;
        }
        this.U0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.V0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.X0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.Y0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.a1 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.b1 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.d1 = bundle.getInt("INPUT_MODE_KEY");
        this.e1 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.g1 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.h1 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.i1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.j1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.k1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.l1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.b1;
        if (text == null) {
            text = q0().getResources().getText(this.a1);
        }
        this.s1 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.t1 = text;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.c1 ? is6.mtrl_picker_fullscreen : is6.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.c1) {
            viewInflate.findViewById(qr6.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(H0(context), -2));
        } else {
            viewInflate.findViewById(qr6.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(H0(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(qr6.mtrl_picker_header_selection_text);
        this.n1 = textView;
        textView.setAccessibilityLiveRegion(1);
        this.o1 = (CheckableImageButton) viewInflate.findViewById(qr6.mtrl_picker_header_toggle);
        this.m1 = (TextView) viewInflate.findViewById(qr6.mtrl_picker_title_text);
        this.o1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.o1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, rf0.v(context, xq6.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], rf0.v(context, xq6.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.o1.setChecked(this.d1 != 0);
        q69.q(this.o1, null);
        K0(this.o1);
        final int i = 2;
        this.o1.setOnClickListener(new View.OnClickListener(this) { // from class: yj4
            public final /* synthetic */ MaterialDatePicker b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        MaterialDatePicker materialDatePicker = this.b;
                        Iterator it = materialDatePicker.Q0.iterator();
                        if (!it.hasNext()) {
                            materialDatePicker.A0(false, false);
                            return;
                        } else {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            materialDatePicker.G0().getClass();
                            throw null;
                        }
                    case 1:
                        MaterialDatePicker materialDatePicker2 = this.b;
                        Iterator it2 = materialDatePicker2.R0.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        materialDatePicker2.A0(false, false);
                        return;
                    default:
                        MaterialDatePicker materialDatePicker3 = this.b;
                        materialDatePicker3.q1.setEnabled(materialDatePicker3.G0().L0());
                        materialDatePicker3.o1.toggle();
                        materialDatePicker3.d1 = materialDatePicker3.d1 == 1 ? 0 : 1;
                        materialDatePicker3.K0(materialDatePicker3.o1);
                        materialDatePicker3.J0();
                        return;
                }
            }
        });
        this.q1 = (Button) viewInflate.findViewById(qr6.confirm_button);
        if (G0().L0()) {
            this.q1.setEnabled(true);
        } else {
            this.q1.setEnabled(false);
        }
        this.q1.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f1;
        if (charSequence != null) {
            this.q1.setText(charSequence);
        } else {
            int i2 = this.e1;
            if (i2 != 0) {
                this.q1.setText(i2);
            }
        }
        CharSequence charSequence2 = this.h1;
        if (charSequence2 != null) {
            this.q1.setContentDescription(charSequence2);
        } else if (this.g1 != 0) {
            this.q1.setContentDescription(H().getResources().getText(this.g1));
        }
        final int i3 = 0;
        this.q1.setOnClickListener(new View.OnClickListener(this) { // from class: yj4
            public final /* synthetic */ MaterialDatePicker b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        MaterialDatePicker materialDatePicker = this.b;
                        Iterator it = materialDatePicker.Q0.iterator();
                        if (!it.hasNext()) {
                            materialDatePicker.A0(false, false);
                            return;
                        } else {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            materialDatePicker.G0().getClass();
                            throw null;
                        }
                    case 1:
                        MaterialDatePicker materialDatePicker2 = this.b;
                        Iterator it2 = materialDatePicker2.R0.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        materialDatePicker2.A0(false, false);
                        return;
                    default:
                        MaterialDatePicker materialDatePicker3 = this.b;
                        materialDatePicker3.q1.setEnabled(materialDatePicker3.G0().L0());
                        materialDatePicker3.o1.toggle();
                        materialDatePicker3.d1 = materialDatePicker3.d1 == 1 ? 0 : 1;
                        materialDatePicker3.K0(materialDatePicker3.o1);
                        materialDatePicker3.J0();
                        return;
                }
            }
        });
        Button button = (Button) viewInflate.findViewById(qr6.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.j1;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i4 = this.i1;
            if (i4 != 0) {
                button.setText(i4);
            }
        }
        CharSequence charSequence4 = this.l1;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.k1 != 0) {
            button.setContentDescription(H().getResources().getText(this.k1));
        }
        final int i5 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: yj4
            public final /* synthetic */ MaterialDatePicker b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        MaterialDatePicker materialDatePicker = this.b;
                        Iterator it = materialDatePicker.Q0.iterator();
                        if (!it.hasNext()) {
                            materialDatePicker.A0(false, false);
                            return;
                        } else {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            materialDatePicker.G0().getClass();
                            throw null;
                        }
                    case 1:
                        MaterialDatePicker materialDatePicker2 = this.b;
                        Iterator it2 = materialDatePicker2.R0.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        materialDatePicker2.A0(false, false);
                        return;
                    default:
                        MaterialDatePicker materialDatePicker3 = this.b;
                        materialDatePicker3.q1.setEnabled(materialDatePicker3.G0().L0());
                        materialDatePicker3.o1.toggle();
                        materialDatePicker3.d1 = materialDatePicker3.d1 == 1 ? 0 : 1;
                        materialDatePicker3.K0(materialDatePicker3.o1);
                        materialDatePicker3.J0();
                        return;
                }
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void h0(Bundle bundle) {
        super.h0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.U0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.V0);
        CalendarConstraints calendarConstraints = this.X0;
        b bVar = new b();
        int i = b.c;
        int i2 = b.c;
        bVar.b = new DateValidatorPointForward(Long.MIN_VALUE);
        long j = calendarConstraints.a.f;
        long j2 = calendarConstraints.b.f;
        bVar.a = Long.valueOf(calendarConstraints.d.f);
        int i3 = calendarConstraints.e;
        CalendarConstraints.DateValidator dateValidator = calendarConstraints.c;
        bVar.b = dateValidator;
        MaterialCalendar materialCalendar = this.Z0;
        Month month = materialCalendar == null ? null : materialCalendar.F0;
        if (month != null) {
            bVar.a = Long.valueOf(month.f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dateValidator);
        Month monthB = Month.b(j);
        Month monthB2 = Month.b(j2);
        CalendarConstraints.DateValidator dateValidator2 = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = bVar.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthB, monthB2, dateValidator2, l == null ? null : Month.b(l.longValue()), i3));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.Y0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.a1);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.b1);
        bundle.putInt("INPUT_MODE_KEY", this.d1);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.e1);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f1);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.g1);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.h1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.i1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.j1);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.k1);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.l1);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void i0() {
        super.i0();
        Window window = D0().getWindow();
        if (this.c1) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.p1);
            if (!this.r1) {
                View viewFindViewById = s0().findViewById(qr6.fullscreen_header);
                ColorStateList colorStateListT = te.t(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListT != null ? Integer.valueOf(colorStateListT.getDefaultColor()) : null;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iQ = m91.q(window.getContext(), R.attr.colorBackground, -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(iQ);
                }
                j97.d(window, false);
                window.getContext();
                Context context = window.getContext();
                int i = Build.VERSION.SDK_INT;
                int iE = i < 27 ? sv0.e(m91.q(context, R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iE);
                boolean z3 = m91.w(0) || m91.w(numValueOf.intValue());
                hl5 hl5Var = new hl5(window.getDecorView());
                (i >= 35 ? new pf9(window, hl5Var) : i >= 30 ? new of9(window, hl5Var) : i >= 26 ? new nf9(window, hl5Var) : new mf9(window, hl5Var)).m(z3);
                boolean zW = m91.w(iQ);
                if (m91.w(iE) || (iE == 0 && zW)) {
                    z = true;
                }
                hl5 hl5Var2 = new hl5(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new pf9(window, hl5Var2) : i2 >= 30 ? new of9(window, hl5Var2) : i2 >= 26 ? new nf9(window, hl5Var2) : new mf9(window, hl5Var2)).l(z);
                jg0 jg0Var = new jg0(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                WeakHashMap weakHashMap = q69.a;
                h69.m(viewFindViewById, jg0Var);
                this.r1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = K().getDimensionPixelOffset(oq6.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.p1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new mo3(D0(), rect));
        }
        J0();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void j0() {
        this.W0.A0.clear();
        super.j0();
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
        ViewGroup viewGroup = (ViewGroup) this.J;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
