import { ExpandLess } from '@mui/icons-material';
import ExpandMore from '@mui/icons-material/ExpandMore';
import { ListItemButton } from '@mui/material';
import Collapse from '@mui/material/Collapse';
import List from '@mui/material/List';
import ListItemText from '@mui/material/ListItemText';
import * as React from 'react';
import Member from '../Member';

const PeopleOption = (pros) => {
    const [open, setOpen] = React.useState(false);

    const handleClick = () => {
        setOpen(!open);
    };

    return (
        <>
            <List
                sx={{ width: '100%', bgcolor: 'background.paper' }}
                component="nav"
                aria-labelledby="nested-list-subheader"
            >
                <ListItemButton onClick={handleClick}>
                    <ListItemText primary="People" />
                    {open ? <ExpandLess /> : <ExpandMore />}
                </ListItemButton>

                <Collapse in={open} timeout="auto" unmountOnExit>
                <Member></Member>
                    {/* <List component="div" disablePadding>
                        <ListItemButton sx={{ pl: 4 }}>

                        </ListItemButton>
                    </List> */}
                </Collapse>
            </List>
        </>
    )
}

export default PeopleOption;