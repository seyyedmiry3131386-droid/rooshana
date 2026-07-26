package androidx.compose.ui.input.pointer;

import ir.mservices.market.movie.data.webapi.CommonDataKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class PointerEventPass {
    public static final PointerEventPass a;
    public static final PointerEventPass b;
    public static final PointerEventPass c;
    public static final /* synthetic */ PointerEventPass[] d;

    static {
        PointerEventPass pointerEventPass = new PointerEventPass("Initial", 0);
        a = pointerEventPass;
        PointerEventPass pointerEventPass2 = new PointerEventPass(CommonDataKt.PLAYER_TYPE_MAIN, 1);
        b = pointerEventPass2;
        PointerEventPass pointerEventPass3 = new PointerEventPass("Final", 2);
        c = pointerEventPass3;
        PointerEventPass[] pointerEventPassArr = {pointerEventPass, pointerEventPass2, pointerEventPass3};
        d = pointerEventPassArr;
        kotlin.enums.a.a(pointerEventPassArr);
    }

    public static PointerEventPass valueOf(String str) {
        return (PointerEventPass) Enum.valueOf(PointerEventPass.class, str);
    }

    public static PointerEventPass[] values() {
        return (PointerEventPass[]) d.clone();
    }
}
