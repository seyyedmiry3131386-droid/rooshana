package defpackage;

import android.content.Context;
import android.util.TypedValue;
import ir.mservices.market.app.survey.data.AnswerDto;
import ir.mservices.market.app.survey.data.QuestionDto;
import ir.mservices.market.app.survey.recycler.AnswerData;
import ir.mservices.market.app.survey.recycler.QuestionData;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerApplicationData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerBannersData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerHeaderData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerMoviesData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerReelData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerReviewData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerSingleAppData;
import ir.mservices.market.movie.data.webapi.HomeReelListDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class gv7 extends c16 {
    public final /* synthetic */ int c = 0;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv7(ExtensionPointDto extensionPointDto, Context context, String str) {
        super(1);
        js3.p(extensionPointDto, "extensionPointDto");
        this.d = extensionPointDto;
        this.e = context;
        this.f = str;
    }

    @Override // defpackage.c16
    public final Object d() {
        QuestionDto questionDto;
        int i = this.c;
        Object obj = this.f;
        int i2 = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                Context context = (Context) obj2;
                ExtensionPointDto extensionPointDto = (ExtensionPointDto) obj3;
                ArrayList arrayList = new ArrayList();
                String str = (String) obj;
                if (ExtensionPointDto.TYPE_APP.equalsIgnoreCase(str)) {
                    arrayList.add(new ShimmerSingleAppData());
                } else if (ExtensionPointDto.TYPE_APP_REVIEW_LIST.equalsIgnoreCase(str)) {
                    TypedValue typedValue = new TypedValue();
                    context.getResources().getValue(pq6.multi_app_card_count, typedValue, true);
                    int i3 = ((int) typedValue.getFloat()) + 1;
                    while (i2 < i3) {
                        arrayList.add(new ShimmerReviewData());
                        i2++;
                    }
                } else if (ExtensionPointDto.TYPE_HEADER.equalsIgnoreCase(str)) {
                    arrayList.add(new ShimmerHeaderData());
                } else if (ExtensionPointDto.TYPE_REEL_LIST.equalsIgnoreCase(str)) {
                    TypedValue typedValue2 = new TypedValue();
                    context.getResources().getValue(m88.T(extensionPointDto.getMode(), "Small", true) ? pq6.small_movie_card_count : m88.T(extensionPointDto.getMode(), "Medium", true) ? pq6.medium_movie_card_count : m88.T(extensionPointDto.getMode(), "Large", true) ? pq6.large_movie_card_count : pq6.grid_movie_card_count, typedValue2, true);
                    int i4 = ((int) typedValue2.getFloat()) + (1 ^ (m88.T(extensionPointDto.getMode(), HomeReelListDto.GRID, true) ? 1 : 0));
                    while (i2 < i4) {
                        arrayList.add(new ShimmerReelData(extensionPointDto.getMode()));
                        i2++;
                    }
                } else if (ExtensionPointDto.TYPE_BANNER_LIST.equalsIgnoreCase(str) || ExtensionPointDto.TYPE_BANNER_LIST_NO_TITLE.equalsIgnoreCase(str)) {
                    TypedValue typedValue3 = new TypedValue();
                    int i5 = m88.T(extensionPointDto.getMode(), "Small", true) ? pq6.small_movie_banner_card_count : (!m88.T(extensionPointDto.getMode(), "Medium", true) && m88.T(extensionPointDto.getMode(), "Large", true)) ? pq6.large_movie_banner_card_count : pq6.medium_movie_banner_card_count;
                    context.getResources().getValue(i5, typedValue3, true);
                    int i6 = ((int) typedValue3.getFloat()) + 1;
                    Integer span = extensionPointDto.getSpan();
                    int iIntValue = i6 * (span != null ? span.intValue() : 1);
                    while (i2 < iIntValue) {
                        arrayList.add(new ShimmerBannersData(extensionPointDto.getMode(), ExtensionPointDto.TYPE_BANNER_LIST.equalsIgnoreCase(str)));
                        i2++;
                    }
                } else if (ExtensionPointDto.TYPE_MOVIE_LIST.equalsIgnoreCase(str) || ExtensionPointDto.TYPE_MOVIE_LIST_BACKGROUND.equalsIgnoreCase(str)) {
                    TypedValue typedValue4 = new TypedValue();
                    int i7 = m88.T(extensionPointDto.getMode(), "Small", true) ? pq6.small_movie_card_count : (!m88.T(extensionPointDto.getMode(), "Medium", true) && m88.T(extensionPointDto.getMode(), "Large", true)) ? pq6.large_movie_card_count : pq6.medium_movie_card_count;
                    context.getResources().getValue(i7, typedValue4, true);
                    int i8 = ((int) typedValue4.getFloat()) + 1;
                    while (i2 < i8) {
                        arrayList.add(new ShimmerMoviesData(extensionPointDto.getMode(), ExtensionPointDto.TYPE_MOVIE_LIST_BACKGROUND.equalsIgnoreCase(str)));
                        i2++;
                    }
                } else {
                    TypedValue typedValue5 = new TypedValue();
                    context.getResources().getValue(extensionPointDto.isMulti() ? pq6.multi_app_card_count : pq6.app_card_count, typedValue5, true);
                    int i9 = ((int) typedValue5.getFloat()) + 1;
                    while (i2 < i9) {
                        arrayList.add(new ShimmerApplicationData(!extensionPointDto.isMulti(), extensionPointDto.isDigested()));
                        i2++;
                    }
                }
                return new fv7(arrayList);
            default:
                List list = (List) obj3;
                if (list == null || (questionDto = (QuestionDto) a.q0(((Number) ((v48) obj2).getValue()).intValue(), list)) == null) {
                    return EmptyList.a;
                }
                ArrayList arrayListE = br9.E(new QuestionData(questionDto.getText()));
                List<AnswerDto> answers = questionDto.getAnswers();
                ArrayList arrayList2 = new ArrayList(wu0.V(answers, 10));
                Iterator<T> it = answers.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new AnswerData((AnswerDto) it.next(), (v48) obj));
                }
                arrayListE.addAll(arrayList2);
                return arrayListE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv7(List list, v48 v48Var, v48 v48Var2) {
        super(1);
        js3.p(v48Var, "questionNumberFlow");
        js3.p(v48Var2, "selectedAnswerFlow");
        this.d = list;
        this.e = v48Var;
        this.f = v48Var2;
    }
}
