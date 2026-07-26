package defpackage;

import android.text.util.Linkify;
import ir.mservices.market.version2.core.utils.SafeURLSpan;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dc7 implements Linkify.MatchFilter {
    @Override // android.text.util.Linkify.MatchFilter
    public final boolean acceptMatch(CharSequence charSequence, int i, int i2) {
        Pattern pattern = SafeURLSpan.d;
        return i == 0 || charSequence.charAt(i - 1) != '@';
    }
}
