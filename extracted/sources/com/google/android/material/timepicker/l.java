package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.ft6;
import defpackage.o37;
import defpackage.pl8;
import defpackage.q69;
import defpackage.ql8;
import defpackage.qr6;
import defpackage.r5;
import defpackage.vk4;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class l implements pl8 {
    public final LinearLayout a;
    public final TimeModel b;
    public final j c;
    public final j d;
    public final ChipTextInputComboView e;
    public final ChipTextInputComboView f;
    public final EditText g;
    public final EditText h;
    public final MaterialButtonToggleGroup i;

    public l(LinearLayout linearLayout, TimeModel timeModel) {
        j jVar = new j(0, this);
        this.c = jVar;
        j jVar2 = new j(1, this);
        this.d = jVar2;
        this.a = linearLayout;
        this.b = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(qr6.material_minute_text_input);
        this.e = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(qr6.material_hour_text_input);
        this.f = chipTextInputComboView2;
        View viewFindViewById = chipTextInputComboView.findViewById(qr6.material_label);
        TextInputLayout textInputLayout = chipTextInputComboView.b;
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = chipTextInputComboView2.findViewById(qr6.material_label);
        TextInputLayout textInputLayout2 = chipTextInputComboView2.b;
        TextView textView2 = (TextView) viewFindViewById2;
        textView.setText(resources.getString(ft6.material_timepicker_minute));
        textView.setImportantForAccessibility(2);
        textView2.setText(resources.getString(ft6.material_timepicker_hour));
        textView2.setImportantForAccessibility(2);
        chipTextInputComboView.setTag(qr6.selection_type, 12);
        chipTextInputComboView2.setTag(qr6.selection_type, 10);
        if (timeModel.c == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(qr6.material_clock_period_toggle);
            this.i = materialButtonToggleGroup;
            materialButtonToggleGroup.l.add(new i(0, this));
            this.i.setVisibility(0);
            f();
        }
        r5 r5Var = new r5(8, this);
        chipTextInputComboView2.setOnClickListener(r5Var);
        chipTextInputComboView.setOnClickListener(r5Var);
        vk4 vk4Var = timeModel.b;
        EditText editText = chipTextInputComboView2.c;
        InputFilter[] filters = editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = vk4Var;
        editText.setFilters(inputFilterArr);
        vk4 vk4Var2 = timeModel.a;
        EditText editText2 = chipTextInputComboView.c;
        InputFilter[] filters2 = editText2.getFilters();
        InputFilter[] inputFilterArr2 = (InputFilter[]) Arrays.copyOf(filters2, filters2.length + 1);
        inputFilterArr2[filters2.length] = vk4Var2;
        editText2.setFilters(inputFilterArr2);
        EditText editText3 = textInputLayout2.getEditText();
        this.g = editText3;
        editText3.setAccessibilityDelegate(new ql8(linearLayout.getResources(), ft6.material_timepicker_hour));
        EditText editText4 = textInputLayout.getEditText();
        this.h = editText4;
        editText4.setAccessibilityDelegate(new ql8(linearLayout.getResources(), ft6.material_timepicker_minute));
        h hVar = new h(chipTextInputComboView2, chipTextInputComboView, timeModel);
        q69.q(chipTextInputComboView2.a, new k(linearLayout.getContext(), ft6.material_hour_selection, resources, timeModel, 0));
        q69.q(chipTextInputComboView.a, new k(linearLayout.getContext(), ft6.material_minute_selection, resources, timeModel, 1));
        editText3.addTextChangedListener(jVar2);
        editText4.addTextChangedListener(jVar);
        e(timeModel);
        EditText editText5 = textInputLayout2.getEditText();
        EditText editText6 = textInputLayout.getEditText();
        editText5.setImeOptions(268435461);
        editText6.setImeOptions(268435462);
        editText5.setOnEditorActionListener(hVar);
        editText5.setOnKeyListener(hVar);
        editText6.setOnKeyListener(hVar);
    }

    @Override // defpackage.pl8
    public final void a() {
        this.a.setVisibility(0);
        b(this.b.f);
    }

    public final void b(int i) {
        this.b.f = i;
        this.e.setChecked(i == 12);
        this.f.setChecked(i == 10);
        f();
    }

    @Override // defpackage.pl8
    public final void c() {
        LinearLayout linearLayout = this.a;
        View focusedChild = linearLayout.getFocusedChild();
        if (focusedChild != null) {
            o37.n(focusedChild, false);
        }
        linearLayout.setVisibility(8);
    }

    public final void d() {
        TimeModel timeModel = this.b;
        this.e.setChecked(timeModel.f == 12);
        this.f.setChecked(timeModel.f == 10);
    }

    public final void e(TimeModel timeModel) {
        EditText editText = this.g;
        j jVar = this.d;
        editText.removeTextChangedListener(jVar);
        EditText editText2 = this.h;
        j jVar2 = this.c;
        editText2.removeTextChangedListener(jVar2);
        Locale locale = this.a.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(timeModel.e));
        String str2 = String.format(locale, "%02d", Integer.valueOf(timeModel.b()));
        ChipTextInputComboView chipTextInputComboView = this.e;
        j jVar3 = chipTextInputComboView.d;
        EditText editText3 = chipTextInputComboView.c;
        String strA = TimeModel.a(chipTextInputComboView.getResources(), str, "%02d");
        chipTextInputComboView.a.setText(strA);
        if (!TextUtils.isEmpty(strA)) {
            editText3.removeTextChangedListener(jVar3);
            editText3.setText(strA);
            editText3.addTextChangedListener(jVar3);
        }
        ChipTextInputComboView chipTextInputComboView2 = this.f;
        j jVar4 = chipTextInputComboView2.d;
        EditText editText4 = chipTextInputComboView2.c;
        String strA2 = TimeModel.a(chipTextInputComboView2.getResources(), str2, "%02d");
        chipTextInputComboView2.a.setText(strA2);
        if (!TextUtils.isEmpty(strA2)) {
            editText4.removeTextChangedListener(jVar4);
            editText4.setText(strA2);
            editText4.addTextChangedListener(jVar4);
        }
        editText.addTextChangedListener(jVar);
        editText2.addTextChangedListener(jVar2);
        f();
    }

    public final void f() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.i;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.f(this.b.g == 0 ? qr6.material_clock_period_am_button : qr6.material_clock_period_pm_button, true);
    }

    @Override // defpackage.pl8
    public final void invalidate() {
        e(this.b);
    }
}
