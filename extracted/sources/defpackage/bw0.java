package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.primitives.ImmutableIntArray;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bw0 {
    public final int a;
    public wp7 b;
    public int c;
    public final int d;
    public Uri e;
    public CharSequence f;
    public Bundle g;
    public boolean h;
    public ImmutableIntArray i;

    /* JADX WARN: Illegal instructions before constructor call */
    public bw0(int i) {
        int i2;
        String str = cw0.j;
        switch (i) {
            case 57369:
                i2 = uq6.media3_icon_album;
                break;
            case 57370:
                i2 = uq6.media3_icon_artist;
                break;
            case 57372:
                i2 = uq6.media3_icon_closed_captions;
                break;
            case 57375:
                i2 = uq6.media3_icon_fast_forward;
                break;
            case 57376:
                i2 = uq6.media3_icon_rewind;
                break;
            case 57396:
                i2 = uq6.media3_icon_pause;
                break;
            case 57399:
                i2 = uq6.media3_icon_play;
                break;
            case 57403:
                i2 = uq6.media3_icon_playlist_add;
                break;
            case 57408:
                i2 = uq6.media3_icon_repeat_all;
                break;
            case 57409:
                i2 = uq6.media3_icon_repeat_one;
                break;
            case 57410:
                i2 = uq6.media3_icon_skip_back;
                break;
            case 57411:
                i2 = uq6.media3_icon_shuffle_on;
                break;
            case 57412:
                i2 = uq6.media3_icon_next;
                break;
            case 57413:
                i2 = uq6.media3_icon_previous;
                break;
            case 57415:
                i2 = uq6.media3_icon_stop;
                break;
            case 57416:
                i2 = uq6.media3_icon_subtitles;
                break;
            case 57421:
                i2 = uq6.media3_icon_volume_down;
                break;
            case 57423:
                i2 = uq6.media3_icon_volume_off;
                break;
            case 57424:
                i2 = uq6.media3_icon_volume_up;
                break;
            case 57430:
                i2 = uq6.media3_icon_skip_forward_10;
                break;
            case 57431:
                i2 = uq6.media3_icon_skip_forward_30;
                break;
            case 57432:
                i2 = uq6.media3_icon_skip_forward_5;
                break;
            case 57433:
                i2 = uq6.media3_icon_skip_back_10;
                break;
            case 57434:
                i2 = uq6.media3_icon_skip_back_30;
                break;
            case 57435:
                i2 = uq6.media3_icon_skip_back_5;
                break;
            case 57436:
                i2 = uq6.media3_icon_queue_add;
                break;
            case 57446:
                i2 = uq6.media3_icon_queue_next;
                break;
            case 57447:
                i2 = uq6.media3_icon_queue_remove;
                break;
            case 57448:
                i2 = uq6.media3_icon_playback_speed;
                break;
            case 57573:
                i2 = uq6.media3_icon_feed;
                break;
            case 57669:
                i2 = uq6.media3_icon_plus;
                break;
            case 57671:
                i2 = uq6.media3_icon_plus_circle_unfilled;
                break;
            case 57675:
                i2 = uq6.media3_icon_block;
                break;
            case 57683:
                i2 = uq6.media3_icon_flag_unfilled;
                break;
            case 57691:
                i2 = uq6.media3_icon_minus;
                break;
            case 58409:
                i2 = uq6.media3_icon_quality;
                break;
            case 58654:
                i2 = uq6.media3_icon_radio;
                break;
            case 58919:
                i2 = uq6.media3_icon_sync;
                break;
            case 59405:
                i2 = uq6.media3_icon_share;
                break;
            case 59448:
                i2 = uq6.media3_icon_star_unfilled;
                break;
            case 59494:
                i2 = uq6.media3_icon_bookmark_unfilled;
                break;
            case 59500:
                i2 = uq6.media3_icon_check_circle_unfilled;
                break;
            case 59517:
                i2 = uq6.media3_icon_heart_unfilled;
                break;
            case 59576:
                i2 = uq6.media3_icon_settings;
                break;
            case 59611:
                i2 = uq6.media3_icon_thumb_down_unfilled;
                break;
            case 59612:
                i2 = uq6.media3_icon_thumb_up_unfilled;
                break;
            case 60288:
                i2 = uq6.media3_icon_playlist_remove;
                break;
            case 61298:
                i2 = uq6.media3_icon_subtitles_off;
                break;
            case 61389:
                i2 = uq6.media3_icon_playback_speed_1_0;
                break;
            case 61512:
                i2 = uq6.media3_icon_signal;
                break;
            case 61916:
                i2 = uq6.media3_icon_closed_captions_off;
                break;
            case 62688:
                i2 = uq6.media3_icon_playback_speed_1_5;
                break;
            case 62689:
                i2 = uq6.media3_icon_playback_speed_1_2;
                break;
            case 62690:
                i2 = uq6.media3_icon_playback_speed_0_5;
                break;
            case 62699:
                i2 = uq6.media3_icon_playback_speed_2_0;
                break;
            case 63220:
                i2 = uq6.media3_icon_skip_forward;
                break;
            case 1040448:
                i2 = uq6.media3_icon_repeat_off;
                break;
            case 1040451:
                i2 = uq6.media3_icon_shuffle_star;
                break;
            case 1040452:
                i2 = uq6.media3_icon_shuffle_off;
                break;
            case 1040470:
                i2 = uq6.media3_icon_skip_forward_15;
                break;
            case 1040473:
                i2 = uq6.media3_icon_skip_back_15;
                break;
            case 1040711:
                i2 = uq6.media3_icon_plus_circle_filled;
                break;
            case 1040712:
                i2 = uq6.media3_icon_minus_circle_filled;
                break;
            case 1040713:
                i2 = uq6.media3_icon_minus_circle_unfilled;
                break;
            case 1040723:
                i2 = uq6.media3_icon_flag_filled;
                break;
            case 1042488:
                i2 = uq6.media3_icon_star_filled;
                break;
            case 1042534:
                i2 = uq6.media3_icon_bookmark_filled;
                break;
            case 1042540:
                i2 = uq6.media3_icon_check_circle_filled;
                break;
            case 1042557:
                i2 = uq6.media3_icon_heart_filled;
                break;
            case 1042651:
                i2 = uq6.media3_icon_thumb_down_filled;
                break;
            case 1042652:
                i2 = uq6.media3_icon_thumb_up_filled;
                break;
            case 1045728:
                i2 = uq6.media3_icon_playback_speed_1_8;
                break;
            case 1045730:
                i2 = uq6.media3_icon_playback_speed_0_8;
                break;
            default:
                i2 = 0;
                break;
        }
        this(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.cw0 a() {
        /*
            r11 = this;
            wp7 r0 = r11.b
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            int r3 = r11.c
            r4 = -1
            if (r3 != r4) goto L10
            r3 = r2
            goto L11
        L10:
            r3 = r1
        L11:
            if (r0 == r3) goto L14
            r1 = r2
        L14:
            java.lang.String r0 = "Exactly one of sessionCommand and playerCommand should be set"
            defpackage.vy2.r(r0, r1)
            com.google.common.primitives.ImmutableIntArray r0 = r11.i
            if (r0 != 0) goto L96
            int r0 = r11.c
            java.lang.String r1 = defpackage.cw0.j
            if (r0 == r2) goto L90
            r1 = 57399(0xe037, float:8.0433E-41)
            int r3 = r11.a
            if (r3 == r1) goto L90
            r1 = 57396(0xe034, float:8.0429E-41)
            if (r3 != r1) goto L30
            goto L90
        L30:
            r1 = 11
            if (r0 == r1) goto L8f
            r1 = 7
            if (r0 == r1) goto L8f
            r2 = 6
            if (r0 == r2) goto L8f
            r1 = 57413(0xe045, float:8.0453E-41)
            if (r3 == r1) goto L8f
            r1 = 57376(0xe020, float:8.0401E-41)
            if (r3 == r1) goto L8f
            r1 = 57410(0xe042, float:8.0449E-41)
            if (r3 == r1) goto L8f
            r1 = 57435(0xe05b, float:8.0484E-41)
            if (r3 == r1) goto L8f
            r1 = 57433(0xe059, float:8.0481E-41)
            if (r3 == r1) goto L8f
            r1 = 1040473(0xfe059, float:1.458013E-39)
            if (r3 == r1) goto L8f
            r1 = 57434(0xe05a, float:8.0482E-41)
            if (r3 != r1) goto L5e
            goto L8f
        L5e:
            r1 = 12
            if (r0 == r1) goto L8d
            r1 = 9
            if (r0 == r1) goto L8d
            r1 = 8
            if (r0 == r1) goto L8d
            r0 = 57412(0xe044, float:8.0451E-41)
            if (r3 == r0) goto L8d
            r0 = 57375(0xe01f, float:8.04E-41)
            if (r3 == r0) goto L8d
            r0 = 63220(0xf6f4, float:8.859E-41)
            if (r3 == r0) goto L8d
            r0 = 57432(0xe058, float:8.048E-41)
            if (r3 == r0) goto L8d
            r0 = 57430(0xe056, float:8.0477E-41)
            if (r3 == r0) goto L8d
            r0 = 1040470(0xfe056, float:1.458009E-39)
            if (r3 == r0) goto L8d
            r0 = 57431(0xe057, float:8.0478E-41)
            if (r3 != r0) goto L90
        L8d:
            r2 = 3
            goto L90
        L8f:
            r2 = 2
        L90:
            com.google.common.primitives.ImmutableIntArray r0 = com.google.common.primitives.ImmutableIntArray.b(r2)
            r11.i = r0
        L96:
            cw0 r1 = new cw0
            wp7 r2 = r11.b
            int r3 = r11.c
            android.net.Uri r6 = r11.e
            java.lang.CharSequence r7 = r11.f
            android.os.Bundle r8 = r11.g
            boolean r9 = r11.h
            com.google.common.primitives.ImmutableIntArray r10 = r11.i
            int r4 = r11.a
            int r5 = r11.d
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw0.a():cw0");
    }

    public final void b(Uri uri) {
        vy2.i("Only content or resource Uris are supported for CommandButton", Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"));
        this.e = uri;
    }

    public final void c(int i) {
        vy2.i("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", this.b == null);
        this.c = i;
    }

    public bw0(int i, int i2) {
        this.a = i;
        this.d = i2;
        this.f = "";
        this.g = Bundle.EMPTY;
        this.c = -1;
        this.h = true;
    }
}
