package defpackage;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.datepicker.g;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
public final class av6 extends g {
    public final /* synthetic */ int i;
    public final /* synthetic */ TextInputLayout j;
    public final /* synthetic */ TextInputLayout k;
    public final /* synthetic */ zj4 l;
    public final /* synthetic */ RangeDateSelector m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av6(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, zj4 zj4Var, int i) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.i = i;
        this.m = rangeDateSelector;
        this.j = textInputLayout2;
        this.k = textInputLayout3;
        this.l = zj4Var;
    }

    @Override // com.google.android.material.datepicker.g
    public final void a() {
        switch (this.i) {
            case 0:
                RangeDateSelector rangeDateSelector = this.m;
                rangeDateSelector.d = null;
                RangeDateSelector.a(rangeDateSelector, this.j, this.k, this.l);
                break;
            default:
                RangeDateSelector rangeDateSelector2 = this.m;
                rangeDateSelector2.e = null;
                RangeDateSelector.a(rangeDateSelector2, this.j, this.k, this.l);
                break;
        }
    }

    @Override // com.google.android.material.datepicker.g
    public final void b(Long l) {
        switch (this.i) {
            case 0:
                RangeDateSelector rangeDateSelector = this.m;
                rangeDateSelector.d = l;
                RangeDateSelector.a(rangeDateSelector, this.j, this.k, this.l);
                break;
            default:
                RangeDateSelector rangeDateSelector2 = this.m;
                rangeDateSelector2.e = l;
                RangeDateSelector.a(rangeDateSelector2, this.j, this.k, this.l);
                break;
        }
    }
}
