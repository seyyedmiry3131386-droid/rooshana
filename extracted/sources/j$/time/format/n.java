package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class n {
    public static final a f = new a(0);
    public n a;
    public final n b;
    public final List c;
    public final boolean d;
    public int e;

    static {
        HashMap map = new HashMap();
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.h hVar = j$.time.temporal.j.a;
        map.put('Q', hVar);
        map.put('q', hVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.l.a);
    }

    public n() {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = null;
        this.d = false;
    }

    public n(n nVar) {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = nVar;
        this.d = true;
    }

    public final void g(j$.time.temporal.p pVar, int i) {
        Objects.requireNonNull(pVar, "field");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
        f(new i(pVar, i, i, u.NOT_NEGATIVE));
    }

    public final void h(j$.time.temporal.p pVar, int i, int i2, u uVar) {
        if (i == i2 && uVar == u.NOT_NEGATIVE) {
            g(pVar, i2);
            return;
        }
        Objects.requireNonNull(pVar, "field");
        Objects.requireNonNull(uVar, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
        f(new i(pVar, i, i2, uVar));
    }

    public final void f(i iVar) {
        i iVarA;
        n nVar = this.a;
        int i = nVar.e;
        if (i < 0) {
            nVar.e = b(iVar);
            return;
        }
        i iVar2 = (i) ((ArrayList) nVar.c).get(i);
        int i2 = iVar.b;
        int i3 = iVar.c;
        if (i2 == i3 && iVar.d == u.NOT_NEGATIVE) {
            iVarA = iVar2.b(i3);
            b(iVar.a());
            this.a.e = i;
        } else {
            iVarA = iVar2.a();
            this.a.e = b(iVar);
        }
        ((ArrayList) this.a.c).set(i, iVarA);
    }

    public final void e(j$.time.temporal.a aVar, Map map) {
        Objects.requireNonNull(aVar, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        v vVar = v.FULL;
        b(new m(aVar, vVar, new b(new r(0, Collections.singletonMap(vVar, linkedHashMap)))));
    }

    public final void c(char c) {
        b(new d(c));
    }

    public final void d(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            b(new d(str.charAt(0)));
        } else {
            b(new l(str));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        e eVar = dateTimeFormatter.a;
        if (eVar.b) {
            eVar = new e(eVar.a, false);
        }
        b(eVar);
    }

    public final void j() {
        n nVar = this.a;
        nVar.e = -1;
        this.a = new n(nVar);
    }

    public final void i() {
        n nVar = this.a;
        if (nVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) nVar.c).size() > 0) {
            n nVar2 = this.a;
            e eVar = new e(nVar2.c, nVar2.d);
            this.a = this.a.b;
            b(eVar);
            return;
        }
        this.a = this.a.b;
    }

    public final int b(f fVar) {
        Objects.requireNonNull(fVar, "pp");
        n nVar = this.a;
        nVar.getClass();
        ((ArrayList) nVar.c).add(fVar);
        this.a.e = -1;
        return ((ArrayList) r2.c).size() - 1;
    }

    public final DateTimeFormatter k(t tVar, j$.time.chrono.m mVar) {
        return l(Locale.getDefault(), tVar, mVar);
    }

    public final DateTimeFormatter l(Locale locale, t tVar, j$.time.chrono.m mVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            i();
        }
        e eVar = new e(this.c, false);
        s sVar = s.a;
        return new DateTimeFormatter(eVar, locale, tVar, mVar);
    }
}
