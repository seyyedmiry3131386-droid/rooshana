package defpackage;

import io.noties.markwon.html.jsoup.parser.Token$TokenType;

/* JADX INFO: loaded from: classes3.dex */
public final class en8 extends tt9 {
    public final StringBuilder c;

    public en8() {
        super(9, Token$TokenType.d);
        this.c = new StringBuilder();
    }

    @Override // defpackage.tt9
    public final tt9 p() {
        tt9.q(this.c);
        return this;
    }

    @Override // defpackage.tt9
    public final String toString() {
        return "<!--" + this.c.toString() + "-->";
    }
}
