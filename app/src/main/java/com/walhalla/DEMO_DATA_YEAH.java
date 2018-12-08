package com.walhalla;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.walhalla.beans.Author___;
import com.walhalla.beans.CommentsBlockResponse;
import com.walhalla.beans.IssueCardFilesResponse;
import com.walhalla.beans.Prodexy;
import com.walhalla.prodexytasker.ui.adapter.item.Header;
import com.walhalla.prodexytasker.ui.adapter.item.Notice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DEMO_DATA_YEAH {

    private static final String TAG = "@@@";
    String[] comments = {
            "Все исправил. Но, надо установить новый чип очистки воды, этот долго" +
                    "не протянет, а без чипа очистки воды убежище обречено.",
            "Слушайте последние новости. Безработица снижается, акции растут, " +
                    "а ООН только что объявила про мир на всей планете! А теперь настоящие новости.",
            "Я на лошади. Ты на белом коне, и я на белом коне. А потом салют… в нашу честь. ",


            "Салют в нашу честь. Сначала на парад, а потом в дом офицеров пойдём. Бал будет. Пиво. Салют. В мою честь салют. Я полковник и ты — на белом коне. ",

            "Ты меня слышишь? Посмотри, какая у меня форма! Посмотри, какие у неё звезды! Я её ещё никому не показывал. Только тебе покажу. ",
            "Посмотри! Это моя парадная. Специально сшил! Посмотри, не бойся! Погоны? Я их поменяю! Вот они, погоны. Вот! Настоящие! Видишь? Полковник. Я полковник. Я их на парад надену. Это моя форма. Самая чистая. ",
            "Что ты кашляешь? Вот пойдём в дом офицеров, пива выпьем — и кашлять не будешь. Я с кортиком, на белом коне, командую парадом! Я полковник! Я командую парадом! Я в звёздах! На белом коне! Я полковник! Я командую парадом!"

    };

    private Prodexy prodexy;
    public List<Object> mObjects = new ArrayList<>();

    public DEMO_DATA_YEAH(Context context) {
        try {
            Gson gson = new Gson();
            JsonReader jsonReader = gson.newJsonReader(
                    new BufferedReader(
                            new InputStreamReader(context.getAssets().open("oo.json"))));

            prodexy = gson.fromJson(jsonReader, new TypeToken<Prodexy>() {
            }.getType());

            mObjects.addAll(prodexy.getIssuelistResponse().getData());

//            Log.i(TAG, "DEMO_DATA_YEAH: "+prodexy.getIssuelistResponse().getData());

        } catch (Exception e) {
            Toast.makeText(context, e.getMessage(), Toast.LENGTH_LONG).show();
            Log.i(TAG, "DEMO_DATA_YEAH: " + e.getLocalizedMessage());
        }
    }

    public static List<Object> loadList() {
        List<Object> arr = new ArrayList<>();

        arr.add(new Header("Новые"));
        arr.add(new Notice(false));


        arr.add(new Header("Просмотренные"));
        arr.add(new Notice(true));

        for (int i = 0; i < 100; i++) {
            arr.add(new Notice(true));
        }


        return arr;
    }


    @Override
    public String toString() {
        return "DEMO_DATA_YEAH{" +
                "prodexy=" + prodexy +
                '}';
    }

    public List<CommentsBlockResponse> getComments() {

        //demo
        List<CommentsBlockResponse> blockResponse = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            CommentsBlockResponse zz = new CommentsBlockResponse();
            zz.setCommentText(getRandom(comments));
            Author___ author = new Author___();
            author.setFullName("Лучин");
            author.setFirstName("А.");
            author.setLastName("Е.");
            author.setUserId(i);
            zz.setAuthor(author);
            blockResponse.add(zz);

        }

        return blockResponse;
    }




    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }



    private String[] photo = {
            "https://www.gravatar.com/avatar/73f5fc5486eda0431e1da1ac1e767743?s=328&d=identicon&r=PG",
            "https://avatars0.githubusercontent.com/u/4228262?s=400&v=4"
    };

    public String getAvatara() {

        return getRandom(photo);
    }

    public List<IssueCardFilesResponse> IssueCardFilesResponse() {
        return prodexy.getIssueCardFilesResponse();
    }
}
