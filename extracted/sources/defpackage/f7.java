package defpackage;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class f7 implements br2 {
    public final /* synthetic */ int a;
    public final FragmentActivity b;
    public final Object c;
    public final Object d;
    public volatile ar2 e;

    public f7(FragmentActivity fragmentActivity, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = new Object();
                this.b = fragmentActivity;
                this.d = fragmentActivity;
                break;
            default:
                this.c = new Object();
                this.b = fragmentActivity;
                this.d = new f7(fragmentActivity, 1);
                break;
        }
    }

    private final Object b() {
        if (((q91) this.e) == null) {
            synchronized (this.c) {
                try {
                    if (((q91) this.e) == null) {
                        this.e = a();
                    }
                } finally {
                }
            }
        }
        return (q91) this.e;
    }

    public static r79 c(FragmentActivity fragmentActivity, FragmentActivity fragmentActivity2) {
        return new r79(fragmentActivity.m(), new z7(0, fragmentActivity2), fragmentActivity.i());
    }

    public q91 a() {
        String str;
        FragmentActivity fragmentActivity = this.b;
        if (fragmentActivity.getApplication() instanceof br2) {
            s91 s91Var = (s91) ((e7) rq4.x(e7.class, (f7) this.d));
            return new q91(s91Var.a, s91Var.b);
        }
        StringBuilder sb = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(fragmentActivity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + fragmentActivity.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.br2
    public final Object e() {
        switch (this.a) {
            case 0:
                return b();
            default:
                if (((s91) this.e) == null) {
                    synchronized (this.c) {
                        try {
                            if (((s91) this.e) == null) {
                                this.e = ((b8) c(this.b, (FragmentActivity) this.d).o(g27.a(b8.class))).b;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return (s91) this.e;
        }
    }
}
