package com.study.springboot_board.controller;

import com.study.springboot_board.dto.BoardDTO;
import com.study.springboot_board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
public class BoardController {
    private BoardService boardService;
    @GetMapping("/save")
    public String saveForm(){
        return "save";
    }

    @GetMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO){
        System.out.println("boardDto = " + boardDTO);
        boardService.save(boardDTO);
        return null;

    }

}
