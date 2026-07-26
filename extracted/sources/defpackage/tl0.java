package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tl0 extends ok4 {
    public final /* synthetic */ int j;

    public /* synthetic */ tl0(int i) {
        this.j = i;
    }

    @Override // defpackage.ok4
    public final void l(rb7 rb7Var, Object obj) {
        switch (this.j) {
            case 0:
                vl0 vl0Var = (vl0) obj;
                js3.p(rb7Var, "statement");
                rb7Var.l(1, vl0Var.a);
                rb7Var.W(2, vl0Var.b);
                rb7Var.W(3, vl0Var.c);
                rb7Var.l(4, vl0Var.d);
                rb7Var.l(5, vl0Var.e);
                break;
            case 1:
                l85 l85Var = (l85) obj;
                js3.p(rb7Var, "statement");
                rb7Var.W(1, l85Var.a);
                rb7Var.W(2, l85Var.b);
                rb7Var.l(3, l85Var.c);
                rb7Var.l(4, l85Var.d);
                rb7Var.l(5, l85Var.e);
                break;
            default:
                l85 l85Var2 = (l85) obj;
                js3.p(rb7Var, "statement");
                rb7Var.W(1, l85Var2.a);
                rb7Var.W(2, l85Var2.b);
                rb7Var.l(3, l85Var2.c);
                rb7Var.l(4, l85Var2.d);
                rb7Var.l(5, l85Var2.e);
                break;
        }
    }

    @Override // defpackage.ok4
    public final String z() {
        switch (this.j) {
            case 0:
                return "INSERT OR REPLACE INTO `callback_url` (`id`,`url`,`type`,`retry_count`,`timestamp`) VALUES (nullif(?, 0),?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `movie_watch_progress` (`play_id`,`movie_id`,`watched_time`,`movie_total_time`,`timestamp`) VALUES (?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `movie_watch_progress` (`play_id`,`movie_id`,`watched_time`,`movie_total_time`,`timestamp`) VALUES (?,?,?,?,?)";
        }
    }
}
