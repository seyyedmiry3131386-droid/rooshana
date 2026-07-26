package activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import defpackage.bs1;
import defpackage.eh5;
import defpackage.es1;
import defpackage.ib1;
import defpackage.ks6;
import defpackage.nr1;
import defpackage.pa1;
import defpackage.pt2;
import defpackage.sr6;
import defpackage.tt1;
import defpackage.xl5;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends Activity implements View.OnClickListener, nr1 {
    public xl5 a;
    public Map b;

    static {
        eh5.a("MainActivity");
    }

    public final void a(boolean z) {
        if (z && this.a != null && this.a.a != null && this.a.a.c != null) {
            this.b = this.a.a.c.e;
        }
        TextView textView = (TextView) findViewById(sr6.tDownloads);
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            if (this.b != null) {
                Iterator it = this.b.values().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        sb.append(((bs1) next).toString());
                        sb.append("\n\n");
                    }
                }
            }
            textView.setText(sb.toString());
        }
    }

    @Override // defpackage.nr1
    public final void j(bs1 bs1Var) {
        a(false);
    }

    @Override // defpackage.nr1
    public final void n(es1 es1Var, int i) {
        a(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01a1  */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r10) throws java.lang.Throwable {
        int viewId = r10.getId();
        if (viewId == sr6.bAdd) {
            // Handle add/download action
        } else if (viewId == sr6.bCancel) {
            // Handle cancel action
        } else if (viewId == sr6.bDown) {
            // Handle download/down action
        } else if (viewId == sr6.bPause) {
            // Handle pause action
        } else if (viewId == sr6.bRemove) {
            // Handle remove action
        } else if (viewId == sr6.bStart) {
            // Handle start action
        } else if (viewId == sr6.bUp) {
            // Handle up action
        } else if (viewId == sr6.tDownloads) {
            // Handle downloads text view click
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ks6.activity_main);
        findViewById(sr6.bAdd).setOnClickListener(this);
        findViewById(sr6.bCancel).setOnClickListener(this);
        findViewById(sr6.bDown).setOnClickListener(this);
        findViewById(sr6.bPause).setOnClickListener(this);
        findViewById(sr6.bRemove).setOnClickListener(this);
        findViewById(sr6.bStart).setOnClickListener(this);
        findViewById(sr6.bUp).setOnClickListener(this);
        findViewById(sr6.tDownloads).setOnClickListener(this);
        xl5 xl5Var = new xl5(this, null, 2, 4, null, null, null, null);
        this.a = xl5Var;
        xl5Var.d(this);
        a(true);
    }

    @Override // android.app.Activity
    public final void onDestroy() throws Throwable {
        if (this.a != null && this.a.a != null) {
            pa1 pa1Var = this.a.a;
            pt2 pt2Var = pa1Var.d;
            if (pt2Var != null && pt2Var.b != null && ((SparseArray) pt2Var.b).size() != 0) {
                List<es1> listF = pa1Var.c.f();
                SparseArray sparseArray = (SparseArray) pt2Var.b;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    tt1 tt1Var = (tt1) sparseArray.valueAt(i);
                    if (tt1Var != null) {
                        tt1Var.k = 300;
                        tt1Var.b();
                    }
                }
                sparseArray.clear();
                for (es1 es1Var : listF) {
                    if (es1Var != null) {
                        es1Var.c(110);
                        pa1Var.b(es1Var, 251);
                    }
                }
            }
            ib1 ib1Var = pa1Var.g;
            if (ib1Var != null) {
                ib1Var.close();
            }
        }
        super.onDestroy();
    }
}
