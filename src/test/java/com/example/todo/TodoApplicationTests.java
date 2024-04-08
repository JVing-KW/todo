package com.example.todo;

import com.example.todo.domain.Todo;
import com.example.todo.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TodoApplicationTests {
    @Autowired
    TodoRepository todoRepository;
    @Test
    public void saveTest() throws Exception{
        Todo entity  = Todo.builder().
                id(1234L).
                title("제목").
                value("내용").
                check(true).
                build();
        todoRepository.save(entity);
    }



}
