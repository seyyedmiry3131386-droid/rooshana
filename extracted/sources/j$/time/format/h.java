package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import j$.time.w;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements f {
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i) {
        this.a = i;
    }

    @Override // j$.time.format.f
    public final boolean i(p pVar, StringBuilder sb) {
        switch (this.a) {
            case 0:
                Long lA = pVar.a(j$.time.temporal.a.INSTANT_SECONDS);
                TemporalAccessor temporalAccessor = pVar.a;
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                Long lValueOf = temporalAccessor.e(aVar) ? Long.valueOf(temporalAccessor.w(aVar)) : null;
                int i = 0;
                if (lA == null) {
                    return false;
                }
                long jLongValue = lA.longValue();
                int iA = aVar.b.a(lValueOf != null ? lValueOf.longValue() : 0L, aVar);
                if (jLongValue >= -62167219200L) {
                    long j = jLongValue - 253402300800L;
                    long jR = j$.com.android.tools.r8.a.R(j, 315569520000L) + 1;
                    LocalDateTime localDateTimeG = LocalDateTime.G(j$.com.android.tools.r8.a.Q(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
                    if (jR > 0) {
                        sb.append('+');
                        sb.append(jR);
                    }
                    sb.append(localDateTimeG);
                    if (localDateTimeG.b.c == 0) {
                        sb.append(":00");
                    }
                } else {
                    long j2 = jLongValue + 62167219200L;
                    long j3 = j2 / 315569520000L;
                    long j4 = j2 % 315569520000L;
                    LocalDateTime localDateTimeG2 = LocalDateTime.G(j4 - 62167219200L, 0, ZoneOffset.UTC);
                    int length = sb.length();
                    sb.append(localDateTimeG2);
                    if (localDateTimeG2.b.c == 0) {
                        sb.append(":00");
                    }
                    if (j3 < 0) {
                        if (localDateTimeG2.a.a == -10000) {
                            sb.replace(length, length + 2, Long.toString(j3 - 1));
                        } else if (j4 == 0) {
                            sb.insert(length, j3);
                        } else {
                            sb.insert(length + 1, Math.abs(j3));
                        }
                    }
                }
                if (iA > 0) {
                    sb.append('.');
                    int i2 = 100000000;
                    while (true) {
                        if (iA > 0 || i % 3 != 0 || i < -2) {
                            int i3 = iA / i2;
                            sb.append((char) (i3 + 48));
                            iA -= i3 * i2;
                            i2 /= 10;
                            i++;
                        }
                    }
                }
                sb.append('Z');
                return true;
            default:
                a aVar2 = n.f;
                TemporalAccessor temporalAccessor2 = pVar.a;
                Object objL = temporalAccessor2.l(aVar2);
                if (objL == null && pVar.c == 0) {
                    throw new j$.time.b("Unable to extract " + aVar2 + " from temporal " + temporalAccessor2);
                }
                w wVar = (w) objL;
                if (wVar == null) {
                    return false;
                }
                sb.append(wVar.h());
                return true;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Instant()";
            default:
                return "ZoneRegionId()";
        }
    }
}
