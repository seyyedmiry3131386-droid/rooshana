package defpackage;

import androidx.fragment.app.d;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialTextInputPicker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ zj4(int i, d dVar) {
        this.a = i;
        this.b = dVar;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ((MaterialDatePicker) this.b).q1.setEnabled(false);
                break;
            default:
                Iterator it = ((MaterialTextInputPicker) this.b).A0.iterator();
                while (it.hasNext()) {
                    ((zj4) it.next()).a();
                }
                break;
        }
    }

    public final void b(Object obj) {
        switch (this.a) {
            case 0:
                MaterialDatePicker materialDatePicker = (MaterialDatePicker) this.b;
                String strY = materialDatePicker.G0().y(materialDatePicker.H());
                materialDatePicker.n1.setContentDescription(materialDatePicker.G0().C0(materialDatePicker.q0()));
                materialDatePicker.n1.setText(strY);
                materialDatePicker.q1.setEnabled(materialDatePicker.G0().L0());
                break;
            default:
                Iterator it = ((MaterialTextInputPicker) this.b).A0.iterator();
                while (it.hasNext()) {
                    ((zj4) it.next()).b(obj);
                }
                break;
        }
    }
}
