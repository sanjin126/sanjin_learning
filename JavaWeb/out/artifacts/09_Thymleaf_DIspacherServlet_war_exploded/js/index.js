function delFruit(fid) {
    if (confirm('是否确认删除?')){
        location.href = 'fruit.do?fid='+fid+'operate=del';
    }
}

function page(pg) {



    location.href = 'fruit.do?pg='+pg;
}