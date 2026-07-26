package defpackage;

import ir.mservices.market.views.BirthdayPicker;
import ir.mservices.market.views.NumberPickerView;
import ir.myket.core.utils.PersianCalendar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bc0 implements aq5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PersianCalendar b;
    public final /* synthetic */ BirthdayPicker c;

    public /* synthetic */ bc0(PersianCalendar persianCalendar, BirthdayPicker birthdayPicker, int i) {
        this.a = i;
        this.b = persianCalendar;
        this.c = birthdayPicker;
    }

    @Override // defpackage.aq5
    public final void a(NumberPickerView numberPickerView) {
        switch (this.a) {
            case 0:
                BirthdayPicker birthdayPicker = this.c;
                w04 w04Var = birthdayPicker.f;
                int value = w04Var.x.getValue();
                PersianCalendar persianCalendar = this.b;
                persianCalendar.set(1, value);
                persianCalendar.set(2, numberPickerView.getValue());
                birthdayPicker.a(persianCalendar, w04Var.v.getValue(), w04Var.w.getValue());
                break;
            default:
                BirthdayPicker birthdayPicker2 = this.c;
                w04 w04Var2 = birthdayPicker2.f;
                int value2 = w04Var2.w.getValue();
                PersianCalendar persianCalendar2 = this.b;
                persianCalendar2.set(2, value2);
                persianCalendar2.set(1, numberPickerView.getValue());
                birthdayPicker2.a(persianCalendar2, w04Var2.v.getValue(), w04Var2.w.getValue());
                break;
        }
    }
}
