package ir.myket.core.utils;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.js3;
import defpackage.ol3;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class PersianCalendar extends Calendar {
    public static final int[] a = {492347, 492712, 493078, 493443, 493808, 494173, 494539, 494904, 495269, 495634, 496000, 496365, 496730, 497095, 497461, 497826, 498191, 498556, 498922, 499287, 499652, 500017, 500383, 500748, 501113, 501478, 501843, 502209, 502574, 502939, 503304, 503670, 504035, 504400, 504765, 505131, 505496, 505861, 506226, 506592, 506957, 507322, 507687, 508053, 508418, 508783, 509148, 509514, 509879, 510244, 510609, 510975, 511340, 511705, 512070, 512435, 512801, 513166, 513531, 513896, 514262, 514627, 514992, 515357, 515723, 516088, 516453, 516818, 517184};
    public static final int[] b = {0, 31, 62, 93, 124, ModuleDescriptor.MODULE_VERSION, 186, 216, 246, 276, 306, 336};
    public static final int[] c = {0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, -46800000, 0};
    public static final int[] d = {1, 292278994, 11, 53, 6, 31, 366, 7, 6, 1, 11, 23, 59, 59, 999, 50400000, 7200000};
    public static final int[] e = {1, 292269054, 11, 50, 3, 28, 355, 7, 3, 1, 11, 23, 59, 59, 999, 50400000, 1200000};

    /* JADX WARN: Illegal instructions before constructor call */
    public PersianCalendar() {
        TimeZone timeZone = TimeZone.getDefault();
        js3.o(timeZone, "getDefault(...)");
        Locale locale = Locale.getDefault();
        js3.o(locale, "getDefault(...)");
        super(timeZone, locale);
        setTimeInMillis(System.currentTimeMillis());
    }

    public final int a(int i) {
        int[] iArr = ((Calendar) this).fields;
        return ol3.b(i, ol3.q(iArr[1], iArr[0] == 1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Calendar
    public final void add(int i, int i2) {
        long j;
        if (i2 == 0) {
            return;
        }
        if (i < 0 || i >= 15) {
            throw new IllegalArgumentException();
        }
        if (i == 0) {
            complete();
            if (((Calendar) this).fields[0] == 1) {
                if (i2 >= 0) {
                    return;
                } else {
                    set(0, 0);
                }
            } else if (i2 <= 0) {
                return;
            } else {
                set(0, 1);
            }
            complete();
            return;
        }
        if (i == 1 || i == 2) {
            complete();
            if (i == 2) {
                int i3 = ((Calendar) this).fields[2] + i2;
                if (i3 < 0) {
                    i2 = (i3 - 11) / 12;
                    i3 = (i3 % 12) + 12;
                } else {
                    i2 = i3 / 12;
                }
                set(2, i3 % 12);
            }
            set(1, ((Calendar) this).fields[1] + i2);
            int[] iArr = ((Calendar) this).fields;
            int iB = ol3.b(((Calendar) this).fields[2], ol3.q(iArr[1], iArr[0] == 1));
            if (((Calendar) this).fields[5] > iB) {
                set(5, iB);
            }
            complete();
            return;
        }
        getTimeInMillis();
        switch (i) {
            case 3:
            case 4:
            case 8:
                j = 604800000;
                break;
            case 5:
            case 6:
            case 7:
                j = 86400000;
                break;
            case 9:
                j = 43200000;
                break;
            case 10:
            case 11:
                ((Calendar) this).time = (((long) i2) * 3600000) + ((Calendar) this).time;
                j = 0;
                break;
            case 12:
                ((Calendar) this).time = (((long) i2) * 60000) + ((Calendar) this).time;
                j = 0;
                break;
            case 13:
                ((Calendar) this).time = (((long) i2) * 1000) + ((Calendar) this).time;
                j = 0;
                break;
            case 14:
                ((Calendar) this).time += (long) i2;
                j = 0;
                break;
            default:
                j = 0;
                break;
        }
        if (j == 0) {
            ((Calendar) this).areFieldsSet = false;
            complete();
            return;
        }
        long j2 = ((long) i2) * j;
        long rawOffset = getTimeZone().getRawOffset();
        int offset = getTimeZone().getOffset(((Calendar) this).time + rawOffset);
        int offset2 = getTimeZone().getOffset(((Calendar) this).time + rawOffset + j2);
        long j3 = offset - offset2;
        if (getTimeZone().getOffset(((Calendar) this).time + rawOffset + j2 + j3) == offset2) {
            j2 += j3;
        }
        ((Calendar) this).time += j2;
        ((Calendar) this).areFieldsSet = false;
        complete();
    }

    @Override // java.util.Calendar
    public final void computeFields() {
        double d2;
        int iFloor;
        long j = ((Calendar) this).time;
        long offset = j + ((long) getTimeZone().getOffset(j));
        int iFloor2 = (int) Math.floor((offset * 1.0d) / 86400000);
        int i = 492268 + iFloor2;
        int[] iArr = ((Calendar) this).fields;
        boolean z = i > 0;
        if (z) {
            d2 = 1.0d;
            iFloor = ((int) Math.floor(Math.rint(((double) (492267 + iFloor2)) / 365.24219d))) + 1;
        } else {
            d2 = 1.0d;
            iFloor = (int) Math.floor(Math.rint(((double) i) / 365.24219d));
        }
        if (iFloor == 0) {
            iFloor = 1;
            z = true;
        }
        if (ol3.c(Math.abs(iFloor), z) <= i) {
            if (iFloor <= 0) {
                iFloor++;
            }
        } else if (iFloor > -1) {
            iFloor--;
        }
        iArr[1] = iFloor;
        int[] iArr2 = ((Calendar) this).fields;
        int i2 = iArr2[1];
        if (i2 <= 0) {
            iArr2[1] = (-i2) + 1;
            iArr2[0] = 0;
        } else {
            iArr2[0] = 1;
        }
        int iC = ol3.c(iArr2[1], iArr2[0] == 1);
        int[] iArr3 = ((Calendar) this).fields;
        int i3 = i - iC;
        int i4 = i3 + 1;
        iArr3[6] = i4;
        int[] iArr4 = b;
        int i5 = iArr4[6];
        if (i4 < i5) {
            iArr3[2] = (int) Math.floor(((double) i3) / 31.0d);
        } else {
            iArr3[2] = ((int) Math.floor(((double) (i3 - i5)) / 30.0d)) + 6;
        }
        int[] iArr5 = ((Calendar) this).fields;
        iArr5[5] = iArr5[6] - iArr4[iArr5[2]];
        long j2 = offset - (((long) iFloor2) * 86400000);
        iArr5[11] = (int) Math.floor((j2 * d2) / 3600000);
        int[] iArr6 = ((Calendar) this).fields;
        int i6 = iArr6[11];
        if (i6 >= 12) {
            iArr6[10] = i6 - 12;
            iArr6[9] = 1;
        } else {
            iArr6[10] = i6 - 12;
            iArr6[9] = 0;
        }
        long j3 = j2 - (((long) i6) * 3600000);
        iArr6[12] = (int) Math.floor((j3 * d2) / 60000);
        int[] iArr7 = ((Calendar) this).fields;
        long j4 = j3 - (((long) iArr7[12]) * 60000);
        iArr7[13] = (int) Math.floor((j4 * d2) / 1000);
        int[] iArr8 = ((Calendar) this).fields;
        iArr8[14] = (int) (j4 - (((long) iArr8[13]) * 1000));
    }

    @Override // java.util.Calendar
    public final void computeTime() {
        int i;
        if (isSet(1) && isSet(2)) {
            if (((Calendar) this).fields[1] == 0) {
                throw new IllegalArgumentException("Year cannot be zero");
            }
            if (!isSet(0)) {
                ((Calendar) this).fields[0] = 1;
            }
            int iFloor = (int) Math.floor(((double) ((Calendar) this).fields[2]) / 12.0d);
            if (iFloor != 0) {
                int[] iArr = ((Calendar) this).fields;
                int i2 = iArr[0];
                if (!((i2 == 1) ^ (iFloor > 0))) {
                    iArr[1] = Math.abs(iFloor) + iArr[1];
                } else if (i2 != 1 || iArr[1] > Math.abs(iFloor)) {
                    int[] iArr2 = ((Calendar) this).fields;
                    if (iArr2[0] != 0 || iArr2[1] > Math.abs(iFloor)) {
                        int[] iArr3 = ((Calendar) this).fields;
                        if (iArr3[0] == 1) {
                            iArr3[1] = iArr3[1] + iFloor;
                        } else {
                            iArr3[1] = iArr3[1] - iFloor;
                        }
                    } else {
                        ((Calendar) this).fields[1] = (Math.abs(iFloor) - ((Calendar) this).fields[1]) + 1;
                        set(0, 1);
                    }
                } else {
                    ((Calendar) this).fields[1] = (Math.abs(iFloor) - ((Calendar) this).fields[1]) + 1;
                    set(0, 0);
                }
            }
            int[] iArr4 = ((Calendar) this).fields;
            int i3 = iArr4[2] % 12;
            iArr4[2] = i3;
            if (i3 < 0) {
                iArr4[2] = i3 + 12;
            }
            int iC = ol3.c(iArr4[1], iArr4[0] == 1) + b[((Calendar) this).fields[2]] + (isSet(5) ? ((Calendar) this).fields[5] - 1 : 0);
            int i4 = -getTimeZone().getOffset(((long) iC) * 86400000);
            if (isSet(11)) {
                i = ((Calendar) this).fields[11];
            } else if (isSet(10) && isSet(9)) {
                int[] iArr5 = ((Calendar) this).fields;
                i = iArr5[10] + (iArr5[9] == 0 ? 0 : 12);
            } else {
                i = 0;
            }
            ((Calendar) this).time = (((long) (iC - 492268)) * 86400000) + 3600000 + (((long) i) * 3600000) + (((long) (isSet(12) ? ((Calendar) this).fields[12] : 0)) * 60000) + ((long) i4) + (((long) (isSet(13) ? ((Calendar) this).fields[13] : 0)) * 1000) + ((long) (isSet(14) ? ((Calendar) this).fields[14] : 0));
            ((Calendar) this).areFieldsSet = false;
        }
    }

    @Override // java.util.Calendar
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Calendar)) {
            return false;
        }
        Calendar calendar = (Calendar) obj;
        return getTimeInMillis() == calendar.getTimeInMillis() && get(1) == calendar.get(1) && get(2) == calendar.get(2) && get(5) == calendar.get(5) && get(10) == calendar.get(10) && get(12) == calendar.get(12) && get(13) == calendar.get(13) && get(14) == calendar.get(14);
    }

    @Override // java.util.Calendar
    public final int getActualMaximum(int i) {
        return d[i];
    }

    @Override // java.util.Calendar
    public final int getActualMinimum(int i) {
        return c[i];
    }

    @Override // java.util.Calendar
    public final int getGreatestMinimum(int i) {
        return c[i];
    }

    @Override // java.util.Calendar
    public final int getLeastMaximum(int i) {
        return e[i];
    }

    @Override // java.util.Calendar
    public final int getMaximum(int i) {
        return d[i];
    }

    @Override // java.util.Calendar
    public final int getMinimum(int i) {
        return c[i];
    }

    @Override // java.util.Calendar
    public final void roll(int i, boolean z) {
        throw new IllegalArgumentException("Not supported");
    }
}
