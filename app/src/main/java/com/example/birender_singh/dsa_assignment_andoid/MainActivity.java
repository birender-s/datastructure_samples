package com.example.birender_singh.dsa_assignment_andoid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.birender_singh.dsa_assignment_andoid.tree.BinaryTree;
import com.example.birender_singh.dsa_assignment_andoid.tree.Node;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BinaryTree tree = new BinaryTree();
        tree.rootNode = new Node(1);
        tree.rootNode.left = new Node(2);
        tree.rootNode.right = new Node(3);
        tree.rootNode.left.left = new Node(4);
        tree.rootNode.left.right = new Node(5);
        tree.rootNode.right.left = new Node(6);
        tree.rootNode.right.right = new Node(7);


        /* print inorder traversal of the input tree */
        System.out.println("original tree (inorder traversal:");
        tree.printInOrder();


        /* convert tree to its mirror */
        tree.mirrorTree();

        /* print inorder traversal of the minor tree */
        System.out.println("mirrored tree (inorder traversal:");
        System.out.println("test...");
        tree.printInOrder();




        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
