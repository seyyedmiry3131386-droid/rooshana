package defpackage;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.datepicker.g;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
public final class ax7 extends g {
    public final /* synthetic */ zj4 i;
    public final /* synthetic */ TextInputLayout j;
    public final /* synthetic */ SingleDateSelector k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax7(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, zj4 zj4Var, TextInputLayout textInputLayout2) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.k = singleDateSelector;
        this.i = zj4Var;
        this.j = textInputLayout2;
    }

    @Override // com.google.android.material.datepicker.g
    public final void a() {
        this.j.getError();
        this.i.a();
    }

    @Override // com.google.android.material.datepicker.g
    public final void b(Long l) {
        SingleDateSelector singleDateSelector = this.k;
        if (l == null) {
            singleDateSelector.a = null;
        } else {
            singleDateSelector.a = l;
        }
        this.i.b(singleDateSelector.a);
    }
}
