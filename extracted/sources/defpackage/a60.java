package defpackage;

import ir.mservices.market.app.update.recycler.AppUpdateData;
import ir.mservices.market.app.update.recycler.a;
import ir.mservices.market.common.comment.data.CommentResultState;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;

/* JADX INFO: loaded from: classes3.dex */
public final class a60 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppUpdateData b;
    public final /* synthetic */ a c;

    public /* synthetic */ a60(AppUpdateData appUpdateData, a aVar, int i) {
        this.a = i;
        this.b = appUpdateData;
        this.c = aVar;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        a aVar = this.c;
        AppUpdateData appUpdateData = this.b;
        switch (i) {
            case 0:
                if (!(((CommentResultState) obj) instanceof CommentResultState.Success)) {
                    ApplicationStateDto applicationStateDto = appUpdateData.l;
                    if (applicationStateDto != null) {
                        applicationStateDto.setCommentState(ApplicationStateDto.STATE_NO_COMMENT);
                    }
                    int i2 = a.X;
                    aVar.y(appUpdateData, 0.0f);
                    appUpdateData.n = 0.0f;
                } else {
                    ApplicationStateDto applicationStateDto2 = appUpdateData.l;
                    if (applicationStateDto2 != null) {
                        applicationStateDto2.setCommentState(ApplicationStateDto.STATE_HAS_COMMENT);
                    }
                    boolean z = appUpdateData.m;
                    ApplicationStateDto applicationStateDto3 = appUpdateData.l;
                    int i3 = a.X;
                    aVar.z(z, applicationStateDto3, false, true);
                }
                break;
            default:
                ApplicationStateDto applicationStateDto4 = appUpdateData.l;
                if (applicationStateDto4 != null) {
                    applicationStateDto4.setCommentState(ApplicationStateDto.STATE_HAS_COMMENT);
                }
                boolean z2 = appUpdateData.m;
                ApplicationStateDto applicationStateDto5 = appUpdateData.l;
                int i4 = a.X;
                aVar.z(z2, applicationStateDto5, false, true);
                break;
        }
        return tx8Var;
    }
}
