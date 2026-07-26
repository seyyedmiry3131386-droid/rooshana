package defpackage;

import android.view.View;
import com.google.android.material.timepicker.MaterialTimePicker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class nk4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialTimePicker b;

    public /* synthetic */ nk4(MaterialTimePicker materialTimePicker, int i) {
        this.a = i;
        this.b = materialTimePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                MaterialTimePicker materialTimePicker = this.b;
                Iterator it = materialTimePicker.Q0.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                materialTimePicker.A0(false, false);
                break;
            case 1:
                MaterialTimePicker materialTimePicker2 = this.b;
                Iterator it2 = materialTimePicker2.R0.iterator();
                while (it2.hasNext()) {
                    ((View.OnClickListener) it2.next()).onClick(view);
                }
                materialTimePicker2.A0(false, false);
                break;
            default:
                MaterialTimePicker materialTimePicker3 = this.b;
                materialTimePicker3.j1 = materialTimePicker3.j1 == 0 ? 1 : 0;
                materialTimePicker3.G0(materialTimePicker3.h1);
                break;
        }
    }
}
