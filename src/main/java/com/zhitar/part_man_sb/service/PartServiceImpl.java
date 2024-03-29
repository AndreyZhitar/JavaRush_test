package com.zhitar.part_man_sb.service;

import com.zhitar.part_man_sb.dao.PartDAO;
import com.zhitar.part_man_sb.entity.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PartServiceImpl implements PartService{

    @Autowired
    private PartDAO partDAO;

    @Override
    public void addPart(Part part) {
        partDAO.save(part);
    }

    @Override
    public void updatePart(Part part) {
        partDAO.save(part);
    }

    @Override
    public void removePart(Integer id) {
        partDAO.deleteById(id);
    }

    @Override
    @Transactional
    public Part getPartById(Integer id) {
        return partDAO.findById(id).orElse(null);
    }

    @Override
    public List<Part> getAllParts() {
        return partDAO.findAll();
    }

    @Override
    public Part findMinNumber() {
        return partDAO.findMinNumber().stream().findAny().orElse(null);
    }

    @Override
    public Part findPartByName(String name) {
        return partDAO.findPartByName(name);
    }

    @Override
    public Page<Part> findAll(Pageable pageable) {
        return partDAO.findAll(pageable);
    }
}
