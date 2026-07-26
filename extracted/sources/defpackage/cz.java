package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.common.base.b;

/* JADX INFO: loaded from: classes.dex */
public final class cz {
    public final vb8 a;
    public final Handler b;
    public n62 c;
    public ly d;
    public int f;
    public ez h;
    public float g = 1.0f;
    public int e = 0;

    public cz(Context context, Looper looper, n62 n62Var) {
        this.a = b.d(new bz(context, 0));
        this.c = n62Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        fz.b((AudioManager) this.a.get(), this.h);
    }

    public final void b(int i) {
        n62 n62Var = this.c;
        if (n62Var != null) {
            wd8 wd8Var = n62Var.h;
            wd8Var.getClass();
            vd8 vd8VarB = wd8.b();
            vd8VarB.a = wd8Var.a.obtainMessage(33, i, 0);
            vd8VarB.b();
        }
    }

    public final void c(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        n62 n62Var = this.c;
        if (n62Var != null) {
            n62Var.h.e(34);
        }
    }

    public final int d(int i, boolean z) {
        int i2;
        h hVar;
        boolean z2 = false;
        if (i == 1 || (i2 = this.f) != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z) {
            int i3 = this.e;
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        } else if (this.e != 2) {
            ez ezVar = this.h;
            if (ezVar == null) {
                if (ezVar == null) {
                    hVar = new h();
                    hVar.c = ly.h;
                    hVar.a = i2;
                } else {
                    h hVar2 = new h();
                    hVar2.a = ezVar.a;
                    hVar2.c = ezVar.d;
                    hVar2.b = ezVar.e;
                    hVar = hVar2;
                }
                ly lyVar = this.d;
                if (lyVar != null && lyVar.a == 1) {
                    z2 = true;
                }
                lyVar.getClass();
                hVar.c = lyVar;
                hVar.b = z2;
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: az
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i4) {
                        ly lyVar2;
                        cz czVar = this.a;
                        czVar.getClass();
                        if (i4 == -3 || i4 == -2) {
                            if (i4 != -2 && ((lyVar2 = czVar.d) == null || lyVar2.a != 1)) {
                                czVar.c(4);
                                return;
                            } else {
                                czVar.b(0);
                                czVar.c(3);
                                return;
                            }
                        }
                        if (i4 == -1) {
                            czVar.b(-1);
                            czVar.a();
                            czVar.c(1);
                        } else if (i4 != 1) {
                            o40.E(i4, "Unknown focus change type: ", "AudioFocusManager");
                        } else {
                            czVar.c(2);
                            czVar.b(1);
                        }
                    }
                };
                Handler handler = this.b;
                handler.getClass();
                this.h = new ez(hVar.a, onAudioFocusChangeListener, handler, (ly) hVar.c, hVar.b);
            }
            if (fz.r((AudioManager) this.a.get(), this.h) == 1) {
                c(2);
                return 1;
            }
            c(1);
            return -1;
        }
        return 1;
    }
}
