package defpackage;

import androidx.compose.animation.core.RepeatMode;
import io.sentry.config.a;
import io.sentry.protocol.DebugImage;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hg0 implements as5, a49 {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public hg0(int i, long j) {
        vy2.s(((ud) this.c) == null);
        this.a = j;
        this.b = j + ((long) i);
    }

    @Override // defpackage.x39
    public /* synthetic */ boolean a() {
        return false;
    }

    public void b(Object obj, Object obj2, hw6 hw6Var) {
        hw6 hw6Var2 = (hw6) obj2;
        ((dc0) ((fi1) this.d).b).w((ht4) obj, hw6Var2.a, hw6Var2.b, hw6Var2.c);
    }

    public long c() {
        if (this.b == -1) {
            long jG = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
                jG += g(entry.getKey(), entry.getValue());
            }
            this.b = jG;
        }
        return this.b;
    }

    @Override // defpackage.as5
    public long d(w72 w72Var) {
        long j = this.b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.b = -1L;
        return j2;
    }

    public long e(long j) {
        long j2 = this.a;
        long j3 = j + this.b;
        if (j3 <= 0) {
            return 0L;
        }
        long jMin = Math.min(j3 / j2, ((long) 1) - 1);
        if (((RepeatMode) this.d) != RepeatMode.a && jMin % ((long) 2) != 0) {
            return ((jMin + 1) * j2) - j3;
        }
        Long.signum(jMin);
        return j3 - (jMin * j2);
    }

    public dl f(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        long j2 = this.b;
        long j3 = j + j2;
        long j4 = this.a;
        return j3 > j4 ? h(j4 - j2, dlVar, dlVar2, dlVar3) : dlVar2;
    }

    public long g(Object obj, Object obj2) throws Exception {
        try {
            long j = ((hw6) obj2).c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.b = -1L;
            throw e;
        }
    }

    @Override // defpackage.x39
    public dl h(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        return ((z39) this.c).h(e(j), dlVar, dlVar2, f(j, dlVar, dlVar3, dlVar2));
    }

    public DebugImage i() {
        long j = this.a;
        String str = (String) this.d;
        if (str.isEmpty()) {
            return null;
        }
        DebugImage debugImage = new DebugImage();
        debugImage.setCodeId(str);
        debugImage.setCodeFile((String) this.c);
        String strD = a.d(str);
        if (strD != null) {
            str = strD;
        }
        debugImage.setDebugId(str);
        debugImage.setImageAddr(String.format("0x%x", Long.valueOf(j)));
        debugImage.setImageSize(this.b - j);
        debugImage.setType("elf");
        return debugImage;
    }

    public void j(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        while (c() > j) {
            if (linkedHashMap.isEmpty()) {
                if (c() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) kotlin.collections.a.n0(linkedHashMap.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            linkedHashMap.remove(key);
            this.b = c() - g(key, value);
            b(key, value, null);
        }
    }

    @Override // defpackage.as5
    public kl7 m() {
        vy2.s(this.a != -1);
        return new x30(1, this.a, (ud2) this.c);
    }

    @Override // defpackage.x39
    public dl q(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        return ((z39) this.c).q(e(j), dlVar, dlVar2, f(j, dlVar, dlVar3, dlVar2));
    }

    @Override // defpackage.x39
    public dl r(dl dlVar, dl dlVar2, dl dlVar3) {
        return h(s(dlVar, dlVar2, dlVar3), dlVar, dlVar2, dlVar3);
    }

    @Override // defpackage.x39
    public long s(dl dlVar, dl dlVar2, dl dlVar3) {
        return (((long) 1) * this.a) - this.b;
    }

    @Override // defpackage.as5
    public void t(long j) {
        long[] jArr = (long[]) ((qq4) this.d).a;
        this.b = jArr[j29.e(jArr, j, true)];
    }

    public hg0(String str, byte[] bArr, long j, long j2) {
        this.c = str;
        this.d = bArr;
        this.a = j;
        this.b = j2;
    }
}
